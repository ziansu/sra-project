@java.lang.Override
protected java.lang.String doInBackground(java.lang.Void... arg0) {
    java.lang.String msg = "Device registered, registration ID=" + (regid);
    try {
        if ((gcm) == null) {
            gcm = com.google.android.gms.gcm.GoogleCloudMessaging.getInstance(ctx);
        }
        regid = gcm.register(SENDER_ID);
        sendRegistrationIdToBackend();
    } catch (java.io.IOException ex) {
        msg = "Error :" + (ex.getMessage());
    }
    return msg;
}