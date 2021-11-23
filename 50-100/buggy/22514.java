private void start() {
    synchronized(this) {
        jobRepository.createOrUpdate(jobInfo);
        pingJob = executorService.scheduleAtFixedRate(this::ping, de.otto.edison.jobs.service.JobRunner.PING_PERIOD, de.otto.edison.jobs.service.JobRunner.PING_PERIOD, java.util.concurrent.TimeUnit.SECONDS);
        final java.lang.String jobId = jobInfo.getJobUri().toString();
        org.slf4j.MDC.put("job_id", jobId.substring(((jobId.lastIndexOf('/')) + 1)));
        org.slf4j.MDC.put("job_type", jobInfo.getJobType());
        de.otto.edison.jobs.service.JobRunner.LOG.info("[started]");
    }
}