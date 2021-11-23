@java.lang.Override
public void await(long timeout, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
    this.waitForSentCountDownLatch.await(timeout, timeUnit);
    this.countDownLatch.await(timeout, timeUnit);
}