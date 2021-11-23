public void testChangeListenerNotification() throws java.lang.Exception {
    final int numDocs = 50;
    final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
    database.addChangeListener(new com.couchbase.lite.Database.ChangeListener() {
        @java.lang.Override
        public void changed(com.couchbase.lite.Database.ChangeEvent event) {
            atomicInteger.incrementAndGet();
        }
    });
    createDocuments(database, numDocs);
    assertEquals(numDocs, atomicInteger.get());
}