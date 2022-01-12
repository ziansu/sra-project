public static double[] getCoordsFromAddress(java.lang.String address, android.content.Context context) {
    if (!(android.location.Geocoder.isPresent()))
        return null;
    
    android.location.Geocoder geocoder = new android.location.Geocoder(context);
    android.location.Address location = null;
    try {
        location = geocoder.getFromLocationName(address, 1).get(0);
    } catch (java.lang.Exception e) {
        return null;
    }
    return new double[]{ location.getLatitude() , location.getLongitude() };
}