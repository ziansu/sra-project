@java.lang.Override
public void run() {
    try {
        auth = apiRequests.verifyAccessToken(accessToken);
        latch.countDown();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}