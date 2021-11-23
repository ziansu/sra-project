@java.lang.Override
public void run() {
    java.lang.String parameter = param;
    lock.release();
    long id = java.lang.Thread.currentThread().getId();
    java.util.Date now = new java.util.Date();
    urlshortener.bangladeshgreen.NotificationQueue.NotificationWorker.logger.info(("\nNotification Worker: \n----------------\n" + parameter));
    checkUser(parameter);
}