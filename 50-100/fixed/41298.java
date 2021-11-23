public boolean addGeoPoint(double lat, double lon, java.lang.String u, int c) {
    double[] xy = decimalDegreesToPixels(lat, lon);
    addPoint(((float) (xy[0])), ((float) (xy[1])), u, c);
    return true;
}