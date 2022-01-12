@java.lang.Override
public void run() {
    try {
        java.lang.System.out.println("服务15秒后启动");
        boDeviceService.updateStatus(0);
        java.lang.Thread.sleep(15000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    startServer();
}