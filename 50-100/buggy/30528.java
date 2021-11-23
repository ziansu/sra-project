public static void init(com.peace.auto.bl.job.Scheduler scheduler) {
    com.peace.auto.bl.job.JobDetail job = com.peace.auto.bl.job.JobBuilder.newJob(com.peace.auto.bl.job.OrderModeJob.class).build();
    com.peace.auto.bl.job.Trigger trigger = com.peace.auto.bl.job.TriggerBuilder.newTrigger().startAt(com.peace.auto.bl.job.DateBuilder.dateOf(0, 15, 0)).withSchedule(com.peace.auto.bl.job.SimpleScheduleBuilder.simpleSchedule().withIntervalInMinutes(20).withRepeatCount(30)).build();
    try {
        scheduler.scheduleJob(job, trigger);
    } catch (com.peace.auto.bl.job.SchedulerException e) {
        log.error("{}", e);
    }
}