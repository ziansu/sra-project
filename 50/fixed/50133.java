@java.lang.Override
public void await() throws java.lang.InterruptedException {
    this.waitForSentCountDownLatch.await(org.rmatil.sync.network.core.ANetworkHandler.MAX_WAITING_TIME, java.util.concurrent.TimeUnit.MILLISECONDS);
    if (null != (this.countDownLatch)) {
        this.countDownLatch.await(org.rmatil.sync.network.core.ANetworkHandler.MAX_WAITING_TIME, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}