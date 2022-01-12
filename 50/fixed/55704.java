public boolean waitMasterPerm(long timeout, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
    return countDownLatch.await(timeout, timeUnit);
}