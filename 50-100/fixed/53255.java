@java.lang.Override
public void run() {
    try {
        if (ru.taskurotta.service.hz.adapter.notification.HzNotificationManagerExecutor.getNotificationsLock().isLocked()) {
            ru.taskurotta.service.hz.adapter.notification.HzNotificationManagerExecutor.getNotificationsManager().execute();
        }else {
            ru.taskurotta.service.hz.adapter.notification.HzNotificationManagerExecutor.ExecuteNotificationsTask.logger.warn("Tried to execute notifications on unlocked node: unconsistent notifier state detected");
        }
    } catch (java.lang.Throwable e) {
        ru.taskurotta.service.hz.adapter.notification.HzNotificationManagerExecutor.ExecuteNotificationsTask.logger.error("Error at notifier execution, skip iteration...", e);
    }
}