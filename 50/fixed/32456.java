public static void cancelJob(java.lang.Long jobId) {
    java.util.concurrent.ScheduledFuture future = com.krishagni.catissueplus.core.administrative.services.impl.ScheduledTaskManager.queuedTasks.remove(jobId);
    try {
        future.cancel(false);
    } catch (java.lang.Exception e) {
    }
}