private void convertLocationToAddress() {
    android.location.Geocoder geocoder = new android.location.Geocoder(this, java.util.Locale.getDefault());
    java.util.List<android.location.Address> locationList;
    try {
        locationList = geocoder.getFromLocation(latitude, longitude, 1);
        address = locationList.get(0).getAddressLine(0);
    } catch (java.io.IOException e) {
        address = "Address not found";
    }
}