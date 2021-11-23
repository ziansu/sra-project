public void getLocationCoordinates() {
    if (locationService.checkLocationServiceSettingsEnabled(getApplicationContext())) {
        locationService.setBroadCastData(getClass().getSimpleName());
        locationService.startTrackingLocation(getApplicationContext());
    }else {
        hideProgress();
        com.mdlive.unifiedmiddleware.commonclasses.utils.MdliveUtils.showGPSSettingsAlert(this, ((android.widget.RelativeLayout) (findViewById(R.id.progressDialog))));
    }
}