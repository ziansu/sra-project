public void onRequestPermissionResult(int requestCode, java.lang.String[] permissions, int[] grantResults) throws org.json.JSONException {
    for (int r : grantResults) {
        if (r == (android.content.pm.PackageManager.PERMISSION_DENIED)) {
            this.callbackContext.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.ERROR, org.apache.cordova.contacts.ContactManager.PERMISSION_DENIED_ERROR));
        }
    }
    switch (requestCode) {
        case org.apache.cordova.contacts.ContactManager.SEARCH_REQ_CODE :
            search(executeArgs);
            break;
        case org.apache.cordova.contacts.ContactManager.SAVE_REQ_CODE :
            break;
        case org.apache.cordova.contacts.ContactManager.REMOVE_REQ_CODE :
            break;
    }
}