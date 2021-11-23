public void run() {
    while (connecting) {
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        (waiting)++;
        if ((waiting) == 10) {
            h.obtainMessage(com.robic.zoran.moonstalker.BlueToothService.CONNECTION_TIMED_OUT_MESSAGE).sendToTarget();
        }
    } 
    waiting = 0;
}