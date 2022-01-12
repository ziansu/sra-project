@java.lang.Override
public void onMessageReceived(java.lang.String from, android.os.Bundle data) {
    java.lang.String message = data.getString("price");
    android.util.Log.d(in.ac.iitm.placement.app.MyGcmListenerService.TAG, ("From: " + from));
    android.util.Log.d(in.ac.iitm.placement.app.MyGcmListenerService.TAG, ("Message: " + (data.toString())));
    if (in.ac.iitm.placement.app.Utils.getprefBool("logedin", getBaseContext())) {
        sendNotification(message);
    }
}