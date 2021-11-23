public void run() {
    while (true) {
        try {
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        checkExpiredSessions(SESSION_EXPIRATION_TIME);
    } 
}