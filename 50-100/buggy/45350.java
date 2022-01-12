@java.lang.Override
public void onUpdate(int cnt) {
    assert cnt >= 0;
    if (!(acceptUpdates))
        return ;
    
    java.util.concurrent.CountDownLatch latch0 = internalLatch;
    if (latch0 == null) {
        org.apache.ignite.internal.util.typedef.internal.U.awaitQuiet(initLatch);
        latch0 = initLatch;
    }
    assert latch0 != null;
    while ((latch0.getCount()) > cnt)
        latch0.countDown();
    
}