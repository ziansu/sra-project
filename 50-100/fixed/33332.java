@java.lang.Override
public void run() {
    while (true) {
        new events.JsonParseTask().updateDbIfNeeded();
        try {
            java.lang.Thread.sleep(((((long) (1000)) * 60) * 60));
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}