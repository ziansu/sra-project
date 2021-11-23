protected void writeLatLongToScreen() {
    android.location.Location l = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    if (l != null) {
        mLatitudeText.setText(java.lang.Double.valueOf(l.getLatitude()).toString());
        mLongitudeText.setText(java.lang.Double.valueOf(l.getLongitude()).toString());
    }else {
        java.lang.System.out.println("***DIDN'T WRITE NEW LAT/LONG VALUES...");
    }
}