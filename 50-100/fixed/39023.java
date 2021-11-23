@java.lang.Override
public void waitOnObjectUntilNs(java.lang.Object object, long untilNs) throws java.lang.InterruptedException {
    long now = nanoTime();
    if (now > untilNs) {
        object.wait(1);
    }else {
        long ms = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis((untilNs - now));
        if (ms > 0) {
            object.wait(ms);
        }else {
            object.wait(1);
        }
    }
}