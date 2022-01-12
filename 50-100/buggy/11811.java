public void enqueue(com.hortonworks.streamline.streams.notification.Notifier notifier, com.hortonworks.streamline.streams.notification.Notification notification) {
    com.hortonworks.streamline.streams.notification.service.NotificationQueueHandler.NotificationQueueTask task = new com.hortonworks.streamline.streams.notification.service.NotificationQueueHandler.NotificationQueueTask(notifier, notification);
    java.util.concurrent.Future<?> future = executorService.submit(task);
    taskMap.put(notification.getId(), org.apache.commons.lang3.tuple.Pair.of(task, future));
}