public void potentiallyPendingTest(org.reactivestreams.Publisher<T> pub, org.reactivestreams.tck.PublisherVerification.PublisherTestRun<T> body, java.lang.String message) throws java.lang.Throwable {
    if (pub != null) {
        body.run(pub);
    }else {
        throw new org.testng.SkipException(message);
    }
}