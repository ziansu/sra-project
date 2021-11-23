private void stopsHandler(int zoomLevel, double lat, double lon) {
    if (zoomLevel >= (minZoomLevel)) {
        float[] d = new float[3];
        android.location.Location.distanceBetween(lat, lon, lastDrewLatitude, lastDrewLongitude, d);
        if ((d[0]) > 300.0F) {
            lastDrewLatitude = lat;
            lastDrewLongitude = lon;
            this.drawBusStops(this.getNearBusStops());
        }
    }
}