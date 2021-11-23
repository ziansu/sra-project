public com.google.android.gms.maps.model.LatLng latlng() {
    if ((coordinates.isEmpty()) || ((coordinates) == null)) {
        return null;
    }
    java.util.StringTokenizer tok = new java.util.StringTokenizer(coordinates, ",");
    return new com.google.android.gms.maps.model.LatLng(java.lang.Double.parseDouble(tok.nextToken()), java.lang.Double.parseDouble(tok.nextToken()));
}