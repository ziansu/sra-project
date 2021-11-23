@java.lang.Override
public void start() {
    super.start();
    if ((scheduledItems) > 0) {
        org.apache.logging.log4j.core.config.LOGGER.debug("{} starting {} threads", org.apache.logging.log4j.core.config.ConfigurationScheduler.SIMPLE_NAME, scheduledItems);
        scheduledItems = java.lang.Math.min(scheduledItems, org.apache.logging.log4j.core.config.ConfigurationScheduler.MAX_SCHEDULED_ITEMS);
        executorService = new java.util.concurrent.ScheduledThreadPoolExecutor(scheduledItems, org.apache.logging.log4j.core.util.Log4jThreadFactory.createDaemonThreadFactory("Scheduled"));
    }else {
        org.apache.logging.log4j.core.config.LOGGER.debug("{}: No scheduled items", org.apache.logging.log4j.core.config.ConfigurationScheduler.SIMPLE_NAME);
    }
}