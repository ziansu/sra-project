@java.lang.Override
public void run() {
    while (true) {
        long timeLimit = (java.lang.System.currentTimeMillis()) - (((24 * 60) * 60) * 1000);
        messageCollection.deleteMany(com.mongodb.client.model.Filters.lt("date", timeLimit)).toString();
        try {
            java.util.concurrent.TimeUnit.HOURS.sleep(1);
        } catch (java.lang.InterruptedException e) {
            org.nenl.chatstorage.DatabaseCleanerDaemon.logger.error(e.getMessage());
        }
    } 
}