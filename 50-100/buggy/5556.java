private void addGeofences(final org.apache.cordova.CallbackContext callbackContext, org.json.JSONArray geofences) {
    com.transistorsoft.locationmanager.adapter.TSCallback callback = new com.transistorsoft.locationmanager.adapter.TSCallback() {
        public void success(java.lang.Object result) {
            callbackContext.success(((java.lang.String) (result)));
        }

        public void error(java.lang.Object result) {
            callbackContext.error(((java.lang.String) (result)));
        }
    };
    getAdapter().addGeofences(geofences, callback);
}