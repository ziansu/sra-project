public java.lang.String getZipCode(double[] latLng) {
    android.location.Geocoder geocoder = new android.location.Geocoder(getActivity(), java.util.Locale.getDefault());
    try {
        java.util.List<android.location.Address> addresses = geocoder.getFromLocation(latLng[0], latLng[1], 1);
        return addresses.get(0).getPostalCode();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}