public void enqueueNoDependencies(java.util.Set<eu.sqooss.service.scheduler.Job> jobs) throws eu.sqooss.service.scheduler.SchedulerException {
    synchronized(this) {
        for (eu.sqooss.service.scheduler.Job job : jobs) {
            logger.debug(("Scheduler ServiceImpl: queuing job " + (job.toString())));
            job.callAboutToBeEnqueued(this);
            java.util.concurrent.Future<java.lang.Void> future = executorService.submit(job);
            job.future = future;
            stats.addWaitingJob(job.getClass().toString());
            stats.incTotalJobs();
        }
    }
}