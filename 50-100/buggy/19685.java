@java.lang.Override
public void run() {
    stopped = false;
    try {
        java.lang.Thread.sleep(timeout);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    while (!(stopped)) {
        sleep(100);
        if (!(paused)) {
            sw.clock();
            sleep(((timeout) / 2));
            sw.clockOff();
            sleep(((timeout) / 2));
        }
    } 
}