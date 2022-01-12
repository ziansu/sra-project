@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    try {
        android.content.Intent intentScan = new android.content.Intent("android.intent.action.MAIN");
        this.cordova.startActivityForResult(((org.apache.cordova.CordovaPlugin) (this)), intentScan, com.inclusionservices.neoscan.NeoScan.REQUEST_CODE);
        callbackContext.success();
        return true;
    } catch (java.lang.Exception e) {
        callbackContext.error(("following error ocurred " + e));
        return false;
    }
}