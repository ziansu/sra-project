private java.lang.String arrayToString() {
    java.lang.String result = "";
    for (com.google.android.gms.maps.model.LatLng l : routePoints) {
        result += (((l.longitude) + " ") + (l.latitude)) + " ";
    }
    return result;
}