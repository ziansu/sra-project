private android.location.Address getAddressFromLocation(android.location.Location location) throws java.lang.Exception {
    android.location.Geocoder geocoder = new android.location.Geocoder(this);
    android.location.Address address = new android.location.Address(java.util.Locale.getDefault());
    try {
        java.util.List<android.location.Address> addr = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
        if ((addr.size()) > 0) {
            address = addr.get(0);
        }
    } catch (java.io.IOException e) {
        throw new java.lang.Exception();
    }
    return address;
}