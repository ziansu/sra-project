public boolean addGeoPoint(double lat, double lon, java.lang.String u, int c) {
    if (((CENTER_LOCATION_LONGITUDE) < 0) || ((CENTER_LOCATION_LATITUDE) < 0)) {
        return false;
    }
    double[] xy = decimalDegreesToPixels(lat, lon);
    addPoint(((float) (xy[0])), ((float) (xy[1])), u, c);
    return true;
}