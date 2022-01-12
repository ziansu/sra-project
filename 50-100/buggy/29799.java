public void stopQueue() {
    com.chaosinmotion.securechat.utils.NotificationCenter.defaultCenter().postNotification(com.chaosinmotion.securechat.messages.SCMessageQueue.NOTIFICATION_STOPQUEUE, this);
    if (null != (socket)) {
        closeConnection();
    }
    if (null != (timerTask)) {
        timerTask.cancel();
        timerTask = null;
    }
    if ((database) != null) {
        database.closeDatabase();
        database = null;
    }
}