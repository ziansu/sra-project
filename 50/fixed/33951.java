public void run() {
    while (true) {
        checkExpiredSessions(SESSION_EXPIRATION_TIME);
        try {
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}