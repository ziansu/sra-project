public java.lang.Integer getLatOffset(double lat, double lon, double offset, boolean checkOutside) {
    java.awt.Point p = tileSource.latLonToXY(lat, lon, zoom);
    int y = ((p.y) - (center.y)) - ((getHeight()) / 2);
    if (checkOutside) {
        if ((y < 0) || (y > (getHeight())))
            return null;
        
    }
    return y;
}