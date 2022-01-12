@java.lang.Override
public void run() {
    while (isRunning) {
        try {
            if (!(isProcessing)) {
                isProcessing = wifiManager.startScan();
            }
            java.lang.Thread.sleep(1000);
        } catch (java.lang.Exception e) {
            android.util.Log.w(de.hhn.munz.ardrone2.MainActivity.TAG, e.getMessage());
        }
    } 
}