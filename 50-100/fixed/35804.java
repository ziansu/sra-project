private static void startApplication() {
    ffw.util.ApplicationLogger.log("ffw-alertsystem started", Application.ALERTMONITOR);
    ffw.alertmonitor.AlertMonitor.messageStack = new java.util.concurrent.ConcurrentLinkedQueue<ffw.alertmonitor.Message>();
    ffw.alertmonitor.AlertMonitor.alertMonitor = new ffw.alertmonitor.AlertMonitor(ffw.alertmonitor.AlertMonitor.messageStack);
    ffw.alertmonitor.AlertMonitor.alertListener = new ffw.alertmonitor.AlertListener(ffw.alertmonitor.AlertMonitor.messageStack);
    ffw.alertmonitor.AlertMonitor.alertMonitorThread = new java.lang.Thread(ffw.alertmonitor.AlertMonitor.alertMonitor);
    ffw.alertmonitor.AlertMonitor.alertListenerThread = new java.lang.Thread(ffw.alertmonitor.AlertMonitor.alertListener);
    ffw.alertmonitor.AlertMonitor.alertMonitorThread.start();
    ffw.alertmonitor.AlertMonitor.alertListenerThread.start();
}