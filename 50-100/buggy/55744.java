public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    com.automatic.android.sdk.Automatic.mIsBound = true;
    com.automatic.android.sdk.Automatic.mService = new android.os.Messenger(service);
    android.util.Log.i(com.automatic.android.sdk.Automatic.TAG, "Attached.");
    try {
        send(new com.automatic.net.ServiceRequest.Handshake(com.automatic.android.sdk.Automatic.mOAuthHandler.getClientId()));
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
        return ;
    }
    android.widget.Toast.makeText(context, "Service Connected", Toast.LENGTH_SHORT).show();
}