private void doStart(java.lang.String action) {
    android.app.Activity activity = cordova.getActivity();
    android.content.Intent serviceIntent = new android.content.Intent(activity, com.urbanairship.cordova.gimbal.GimbalAdapterService.class);
    if (action != null) {
        serviceIntent.setAction(action);
    }
    serviceIntent.putExtra(GimbalAdapterService.GIMBAL_KEY, gimbalKey);
    activity.startService(serviceIntent);
    if ((callbackContext) != null) {
        callbackContext.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.OK));
        callbackContext = null;
    }
}