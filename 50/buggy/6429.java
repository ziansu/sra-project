@org.testng.annotations.Test
public void spec317_mustSignalOnErrorWhenPendingAboveLongMaxValue_shouldFail_onAsynchDemandIgnoringPublisher() throws java.lang.Throwable {
    final java.util.concurrent.ExecutorService signallersPool = java.util.concurrent.Executors.newFixedThreadPool(2);
    requireTestFailure(new org.reactivestreams.tck.ThrowingRunnable() {
        @java.lang.Override
        public void run() throws java.lang.Throwable {
            demandIgnoringAsynchronousPublisherVerification(signallersPool).spec317_mustSignalOnErrorWhenPendingAboveLongMaxValue();
        }
    }, "Expected onError(java.lang.IllegalStateException)");
}