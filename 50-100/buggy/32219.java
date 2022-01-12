public void run() {
    com.google.gson.functional.ConcurrencyTest.MyObject myObj = new com.google.gson.functional.ConcurrencyTest.MyObject();
    try {
        startLatch.await();
        for (int i = 0; i < 10; i++) {
            java.lang.String json = gson.toJson(myObj);
        }
    } catch (java.lang.Throwable t) {
        failed.set(true);
    } finally {
        finishedLatch.countDown();
    }
}