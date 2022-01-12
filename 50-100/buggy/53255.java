@java.lang.Override
public void run() {
    com.hazelcast.core.ILock nodeLock = ru.taskurotta.service.hz.adapter.notification.HzNotificationManagerExecutor.getNotificationsLock();
    try {
        if (nodeLock.isLocked()) {
            ru.taskurotta.service.hz.adapter.notification.HzNotificationManagerExecutor.getNotificationsManager().execute();
        }else {
            ru.taskurotta.service.hz.adapter.notification.HzNotificationManagerExecutor.ExecuteNotificationsTask.logger.warn("Tried to execute notifications on unlocked node: unconsistent notifier state detected");
        }
    } catch (java.lang.Throwable e) {
        ru.taskurotta.service.hz.adapter.notification.HzNotificationManagerExecutor.ExecuteNotificationsTask.logger.error("Error at notifier execution, skip iteration...", e);
    }
}