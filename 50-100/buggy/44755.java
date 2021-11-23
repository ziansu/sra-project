com.hazelcast.nio.Connection get(int timeout) throws java.lang.Throwable {
    countDownLatch.await(timeout, java.util.concurrent.TimeUnit.MILLISECONDS);
    if ((connection) != null) {
        return connection;
    }
    if ((throwable) != null) {
        throw throwable;
    }
    throw new java.util.concurrent.TimeoutException((("Authentication response did not come back in " + timeout) + " millis"));
}