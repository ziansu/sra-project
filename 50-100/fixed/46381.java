private long getCleanupTimeSeconds() {
    try {
        java.lang.String cleanupTimeString = java.lang.System.getProperty(RMNodeStarter.SECONDS_TASK_CLEANUP_TIMEOUT_PROP_NAME);
        if (cleanupTimeString != null) {
            return java.lang.Long.parseLong(cleanupTimeString);
        }else {
            return org.ow2.proactive.scheduler.task.utils.TaskKiller.CLEANUP_TIME_DEFAULT_SECONDS;
        }
    } catch (java.lang.NumberFormatException e) {
        org.ow2.proactive.scheduler.task.utils.TaskKiller.LOGGER.warn(((("proactive.task.cleanup.time: " + (java.lang.System.getProperty(RMNodeStarter.SECONDS_TASK_CLEANUP_TIMEOUT_PROP_NAME))) + " is not parsable to long, fallback to default value. Error : ") + (e.getMessage())));
        return org.ow2.proactive.scheduler.task.utils.TaskKiller.CLEANUP_TIME_DEFAULT_SECONDS;
    }
}