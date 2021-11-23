public void disconnect() {
    org.md2k.utilities.Report.Log.d(org.md2k.microsoftband.Device.TAG, ((deviceId) + "disconnect..."));
    tryConnect = false;
    stopConnectThread();
    if (bandClient.isConnected())
        try {
            bandClient.disconnect().await();
        } catch (java.lang.InterruptedException | com.microsoft.band.BandException e) {
            e.printStackTrace();
        }
    
    org.md2k.utilities.Report.Log.d(org.md2k.microsoftband.Device.TAG, ((deviceId) + "...disconnect"));
}