@java.lang.Override
protected android.location.Address doInBackground(java.lang.Double... args) {
    if ((getActivity()) == null) {
        return null;
    }
    double latitude = args[0];
    double longitude = args[1];
    try {
        return org.wordpress.android.util.GeocoderUtils.getAddressFromCoords(getActivity(), latitude, longitude);
    } catch (java.lang.IllegalArgumentException iae) {
        return null;
    }
}