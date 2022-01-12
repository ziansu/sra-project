@java.lang.Override
public void run() {
    while (true) {
        if (!(pollStarted)) {
            return ;
        }
        try {
            pollMessage(callback);
        } catch (java.lang.Exception ignore) {
            com.scienjus.smartqq.client.SmartQQClient.LOGGER.error(ignore.getMessage());
        }
    } 
}