private void scheduleJob(org.bitrepository.service.workflow.JobTimerTask task) {
    if ((task.getIntervalBetweenRuns()) > 0) {
        timer.scheduleAtFixedRate(task, org.bitrepository.service.scheduler.TimerbasedScheduler.NO_DELAY, org.bitrepository.service.scheduler.TimerbasedScheduler.SCHEDULE_INTERVAL);
    }else {
        timer.schedule(task, org.bitrepository.service.scheduler.TimerbasedScheduler.NO_DELAY);
    }
}