public void onRequestPermissionResult(int requestCode, java.lang.String[] permissions, int[] grantResults) throws org.json.JSONException {
    if (requestCode == (cordova.plugin.situm.indoor.navigation.SitumIndoorNavigation.LOCATION_PERMISSION_RESULT)) {
        locationUpdate();
    }
}