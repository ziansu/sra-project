@java.lang.Override
public void run() {
    while (keepAlive) {
        try {
            sendString(de.hhn.munz.ardrone2.ATCommand.keepAlive(), false);
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception e) {
            android.util.Log.w(de.hhn.munz.ardrone2.NetworkController.TAG, ("KeepAlive: " + (e.getMessage())));
        }
    } 
}