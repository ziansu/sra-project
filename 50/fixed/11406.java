@java.lang.Override
public void run() {
    try {
        boDeviceService.updateStatus(0);
        java.lang.Thread.sleep(15000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    startServer();
}