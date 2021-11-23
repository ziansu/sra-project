public void move(double lat, double lng) {
    org.osmdroid.util.GeoPoint gp = new org.osmdroid.util.GeoPoint(lat, lng);
    mapController.setCenter(gp);
}