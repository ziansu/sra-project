public static void setGoodNight(org.springframework.scheduling.TaskScheduler scheduler, resources.internal.Hue hue) {
    if (hue.getScene().getGoodNight().isEnabled()) {
        scheduler.schedule(com.sonie.web.util.RunnableUtil.setGoodNight(com.sonie.web.util.CronJobUtil.LOG, hue), new org.springframework.scheduling.support.CronTrigger(com.sonie.web.util.DateUtil.getCronDate(hue.getScene().getGoodNight().getTime())));
    }
}