@java.lang.Override
public void onError(java.lang.Throwable e) {
    result[1] = "Can't stop listening before starting.";
    latch.countDown();
    latch.countDown();
}