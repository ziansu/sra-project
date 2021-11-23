@java.lang.Override
public void call(java.lang.Object... args) {
    java.lang.Double[] tempArr = new java.lang.Double[2];
    final double lat = java.lang.Double.valueOf(args[0].toString());
    final double longdick = java.lang.Double.valueOf(args[1].toString());
    currentLocationMidpoint.add(new com.google.android.gms.maps.model.LatLng(lat, longdick));
}