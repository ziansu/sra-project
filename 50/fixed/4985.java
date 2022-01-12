public void startEvent() {
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new drose379.ridefundraiser.GPSHelper.CustomLocationListener());
    callback.updateStatus(true);
}