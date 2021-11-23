@java.lang.Override
public void onCompleted() {
    long endRequestNanos = java.lang.System.nanoTime();
    latch.countDown();
}