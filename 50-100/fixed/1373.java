private void stopsHandler(int zoomLevel, double lat, double lon) {
    if (zoomLevel >= (this.minZoomLevel)) {
        float[] d = new float[3];
        android.location.Location.distanceBetween(lat, lon, this.lastDrewLatitude, this.lastDrewLongitude, d);
        if ((d[0]) > 300.0F) {
            this.lastDrewLatitude = lat;
            this.lastDrewLongitude = lon;
            this.drawBusStops(this.getNearBusStops());
        }
    }
}