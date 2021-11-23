@java.lang.Override
public void run() {
    java.lang.System.out.println("Turning Sensor on...");
    try {
        java.util.concurrent.TimeUnit.SECONDS.sleep(1);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    synchronized(status) {
        status = true;
        captureStatus = false;
        java.lang.System.out.println("Sensor on");
    }
}