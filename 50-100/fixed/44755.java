com.hazelcast.nio.Connection get(int timeout) throws java.lang.Throwable {
    if (!(countDownLatch.await(timeout, java.util.concurrent.TimeUnit.MILLISECONDS))) {
        throw new java.util.concurrent.TimeoutException((("Authentication response did not come back in " + timeout) + " millis"));
    }
    if ((connection) != null) {
        return connection;
    }
    throw throwable;
}