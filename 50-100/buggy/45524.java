@java.lang.Override
public void run() {
    try {
        de.kuschku.util.AndroidAssert.assertNotNull(client);
        while (running) {
            de.kuschku.libquassel.functions.types.Heartbeat heartbeat = new de.kuschku.libquassel.functions.types.Heartbeat();
            busProvider.dispatch(heartbeat);
            android.util.Log.d("libquassel", "Sending heartbeat");
            java.lang.Thread.sleep((30 * 1000));
        } 
    } catch (java.lang.InterruptedException e) {
    }
}