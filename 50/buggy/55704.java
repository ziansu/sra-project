public void waitMasterPerm(long timeout, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
    countDownLatch.await(timeout, timeUnit);
}