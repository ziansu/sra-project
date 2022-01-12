@java.lang.Override
public void changed(com.couchbase.lite.LiveQuery.ChangeEvent event) {
    if ((event.getError()) != null) {
        throw new java.lang.RuntimeException(event.getError());
    }
    if ((event.getRows().getCount()) == 2) {
        countDownLatch.countDown();
    }
}