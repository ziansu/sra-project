@java.lang.Override
public void onError(com.vk.sdk.api.VKError error) {
    java.lang.String err = error.toString();
    android.util.Log.e(ru.trilan.socialvk.SocialVk.TAG, ("VK Authorization error! " + err));
    _callbackContext.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.ERROR, err));
    _callbackContext.error(error.errorMessage);
}