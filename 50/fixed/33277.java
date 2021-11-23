@java.lang.Override
public void onGeolocationPermissionsShowPrompt(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
    callback.invoke(origin, true, false);
    super.onGeolocationPermissionsShowPrompt(origin, callback);
}