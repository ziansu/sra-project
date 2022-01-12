private void addNewTrigger(com.peace.auto.bl.job.JobExecutionContext context, long seconds) {
    com.peace.auto.bl.job.Trigger tr = com.peace.auto.bl.job.TriggerBuilder.newTrigger().forJob(context.getJobDetail()).startAt(com.peace.auto.bl.job.DateBuilder.futureDate(((int) (seconds)), DateBuilder.IntervalUnit.SECOND)).build();
    try {
        context.getScheduler().scheduleJob(tr);
    } catch (com.peace.auto.bl.job.SchedulerException e) {
        log.info("{}", e);
    }
}