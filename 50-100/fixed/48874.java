@java.lang.Override
public void run() {
    synchronized(status) {
        java.lang.System.out.println("Turning sensor off...");
        try {
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        status = false;
        image = null;
        captureStatus = false;
        java.lang.System.out.println("Sensor off");
    }
}