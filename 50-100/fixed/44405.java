@java.lang.Override
public void run() {
    long t = start;
    try {
        while (true) {
            java.util.concurrent.CountDownLatch signal = queue.take();
            if ((clock.nowMillis()) >= (t + (period.getValue()))) {
                runnable.getValue().run();
                t = clock.nowMillis();
            }
            signal.countDown();
        } 
    } catch (java.lang.InterruptedException e) {
    }
}