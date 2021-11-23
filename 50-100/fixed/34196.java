public java.lang.String getCity(android.content.Context context) {
    android.location.Geocoder gcd = new android.location.Geocoder(context, java.util.Locale.getDefault());
    java.util.List<android.location.Address> addresses = null;
    try {
        addresses = gcd.getFromLocation(mLatitude, mLongitude, 1);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    if ((addresses != null) && (!(addresses.isEmpty()))) {
        mCity = addresses.get(0).getLocality();
    }
    return mCity;
}