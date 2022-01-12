@java.lang.Override
public void run() {
    while (true) {
        new events.JsonParseTask().updateDbIfNeeded();
        try {
            long sleepTime = (1000 * 60) * 60;
            java.lang.Thread.sleep(sleepTime);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}