public org.osmdroid.util.GeoPoint getLocationFromAddress(java.lang.String address) {
    android.location.Geocoder geocoder = new android.location.Geocoder(MyApp.mAppContext);
    try {
        java.util.List<android.location.Address> addresses = geocoder.getFromLocationName(address, 1);
        if ((addresses.size()) > 0) {
            android.location.Address myAddress = addresses.get(0);
            return new org.osmdroid.util.GeoPoint(myAddress.getLatitude(), myAddress.getLongitude());
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return new org.osmdroid.util.GeoPoint(0, 0);
}