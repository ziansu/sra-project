public java.lang.String getAddressLine(com.google.android.gms.maps.model.LatLng point) {
    android.location.Geocoder geocoder = new android.location.Geocoder(this, java.util.Locale.getDefault());
    try {
        java.util.List<android.location.Address> results = geocoder.getFromLocation(point.latitude, point.longitude, 1);
        if (results != null) {
            return results.get(0).getAddressLine(0);
        }
    } catch (java.lang.Exception e) {
        return "Location";
    }
    return "Location";
}