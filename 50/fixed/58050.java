@org.junit.After
public void shutdown() throws java.lang.Exception {
    if ((mService) != null) {
        mService.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS);
    }
    mProducer.close();
    mConsumer.close();
    mBroker.stop();
}