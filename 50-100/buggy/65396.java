public void stopService() {
    android.util.Log.d(com.github.pires.obd.reader.io.ObdGatewayService.TAG, "Stopping service..");
    notificationManager.cancel(com.github.pires.obd.reader.io.NOTIFICATION_ID);
    jobsQueue.clear();
    isRunning = false;
    if ((sock) != null)
        try {
            sock.close();
        } catch (java.io.IOException e) {
            android.util.Log.e(com.github.pires.obd.reader.io.ObdGatewayService.TAG, e.getMessage());
        }
    
    stopSelf();
}