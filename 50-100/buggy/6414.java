private void getLocation() {
    try {
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, com.enyedi.peter.sensorapp.ui.MainActivity.MIN_TIME_BW_UPDATES, com.enyedi.peter.sensorapp.ui.MainActivity.MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
        if ((locationManager) != null) {
            loc = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if ((loc) != null) {
                locationList.add(loc);
            }
        }
    } catch (java.lang.SecurityException e) {
        e.printStackTrace();
    }
}