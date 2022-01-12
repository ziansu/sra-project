public void startQueue(android.content.Context ctx) {
    if (!(com.chaosinmotion.securechat.rsa.SCRSAManager.shared().canStartServices()))
        return ;
    
    if ((database) == null) {
        database = new com.chaosinmotion.securechat.messages.SCMessageDatabase();
        database.openDatabase(ctx);
    }
    startNetworkQueue();
    com.chaosinmotion.securechat.utils.NotificationCenter.defaultCenter().postNotification(com.chaosinmotion.securechat.messages.SCMessageQueue.NOTIFICATION_STARTQUEUE, this);
}