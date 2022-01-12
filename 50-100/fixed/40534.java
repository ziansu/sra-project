private void setAddress(android.location.Location mLocation) {
    if (mLocation != null) {
        double latitude = mLocation.getLatitude();
        double longitude = mLocation.getLongitude();
        br.com.manta.informations.LocationAddress.getAddressFromLocation(latitude, longitude, getApplicationContext(), new br.com.manta.activity.CheckinActivity.GeocoderHandler());
    }
}