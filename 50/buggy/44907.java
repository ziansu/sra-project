@java.lang.Override
public void onRequestPermissionResult(int requestCode, java.lang.String[] permissions, int[] grantResults) throws org.json.JSONException {
    super.onRequestPermissionResult(requestCode, permissions, grantResults);
    if (requestCode == (cordova.plugin.situm.indoor.navigation.SitumIndoorNavigation.LOCATION_PERMISSION_RESULT)) {
        locationUpdate();
    }
}