private void moveToOffScreenState() {
    mLocationManager.removeGpsStatusListener(mGPSListener);
    mLocationManager.removeUpdates(mCoarse);
    mLocationManager.removeUpdates(mFine);
    mLocationManager.removeUpdates(mGPSSlow);
    mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, org.unchiujar.umbra.LocationService.LOCATION_UPDATE_INTERVAL, (((float) (LocationOrder.METERS_RADIUS)) * 2), mGPSSlow);
    mGPSSlowMode = true;
}