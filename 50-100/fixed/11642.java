public void notifyRegistrationError() {
    android.util.Log.v(com.plugin.gcm.NotificationService.TAG, ("GCM Registration Failed for webview " + (getWebView())));
    if ((getRegisterCallBack()) != null) {
        setNotifiedOfRegistered(false);
        getRegisterCallBack().error(mNotificationService.mRegistrationErrorId);
    }else {
        android.util.Log.v(com.plugin.gcm.NotificationService.TAG, ("registration error -> No Register callback - webview: " + (getWebView())));
    }
}