private void schedulePowerOff() {
    try {
        org.quartz.CronExpression cronExpression = new org.quartz.CronExpression(properties.getProperty("shutdown.cron"));
        if (((currentShutdownCron) != null) && (cronExpression.getExpressionSummary().equals(currentShutdownCron.getExpressionSummary()))) {
            return ;
        }
        currentShutdownCron = cronExpression;
        org.rl.scheduled.turnoff.QuartzController.reschedulePowerOffJob(cronExpression);
    } catch (java.text.ParseException e) {
        org.rl.scheduled.turnoff.MainController.LOGGER.warn("Could not parse the given cron expression for shutdown.", e);
    } catch (org.quartz.SchedulerException e) {
        org.rl.scheduled.turnoff.MainController.LOGGER.error("Failed while configuring cron for shutdown.", e);
    }
}