@java.lang.Override
public void onError(java.lang.Throwable throwable) {
    isComplete[0] = false;
    latch.countDown();
}