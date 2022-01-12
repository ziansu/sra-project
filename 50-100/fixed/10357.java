public void testIsGCEResultValid() throws java.lang.InterruptedException {
    latch = new java.util.concurrent.CountDownLatch(com.elorri.android.builditbigger.ApplicationTest.COUNT_LATCH);
    com.elorri.android.builditbigger.GCEndpointsApiService task = new com.elorri.android.builditbigger.GCEndpointsApiService(null);
    task.execute(getContext());
    task.setListener(new com.elorri.android.builditbigger.GCEndpointsApiService.GCEndpointsApiServiceListener() {
        @java.lang.Override
        public void onCompleted(java.lang.String joke) {
            result = joke;
            latch.countDown();
        }
    });
    latch.await();
    assertNotNull(result);
    assertEquals("This is a joke from a Java Library", result);
}