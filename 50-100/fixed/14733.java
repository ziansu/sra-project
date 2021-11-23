public void getLocationCoordinates() {
    if (locationService.checkLocationServiceSettingsEnabled(this)) {
        locationService.setBroadCastData(getClass().getSimpleName());
        locationService.startTrackingLocation(this);
    }else {
        hideProgress();
        com.mdlive.unifiedmiddleware.commonclasses.utils.MdliveUtils.showGPSSettingsAlert(this, ((android.widget.RelativeLayout) (findViewById(R.id.progressDialog))));
    }
}