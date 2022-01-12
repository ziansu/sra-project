@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, resultCode, intent);
    if (((_pendingCallback) != null) && (requestCode == (com.ludei.share.cordova.SharePlugin.SHARE_REQUEST_CODE))) {
        org.json.JSONArray array = new org.json.JSONArray();
        array.put("");
        array.put((resultCode == (android.app.Activity.RESULT_OK)));
        _pendingCallback.sendPluginResult(new com.ludei.share.cordova.PluginResult(PluginResult.Status.OK, (resultCode == (android.app.Activity.RESULT_OK))));
        _pendingCallback = null;
    }
}