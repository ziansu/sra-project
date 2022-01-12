@java.lang.Override
public void run() {
    if ((activeTasks.get()) > 0) {
        long size = pollStream();
        received(new co.cask.cdap.common.stream.notification.StreamSizeNotification(java.lang.System.currentTimeMillis(), size), null);
    }
}