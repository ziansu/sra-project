public void callPharmacyService(final com.mdlive.unifiedmiddleware.plugins.NetworkSuccessListener<org.json.JSONObject> responseListener, final com.mdlive.unifiedmiddleware.plugins.NetworkErrorListener errorListener) {
    if (locationService.checkLocationServiceSettingsEnabled(this)) {
        showProgress();
        registerReceiver(locationReceiver, intentFilter);
        locationService.setBroadCastData(getClass().getSimpleName());
        locationService.startTrackingLocation(this);
    }else {
        com.mdlive.unifiedmiddleware.services.pharmacy.PharmacyService services = new com.mdlive.unifiedmiddleware.services.pharmacy.PharmacyService(this, null);
        services.doMyPharmacyRequest("", "", responseListener, errorListener);
    }
}