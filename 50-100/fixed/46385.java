private boolean init(java.lang.String appId) {
    this.cordova.setActivityResultCallback(this);
    android.util.Log.i(ru.trilan.socialvk.SocialVk.TAG, "VK initialize");
    com.vk.sdk.VKSdk.initialize(getApplicationContext());
    if ((_callbackContext) != null) {
        _callbackContext.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.OK));
        _callbackContext.success();
    }
    return true;
}