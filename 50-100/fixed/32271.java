@java.lang.Deprecated
public java.lang.Integer getLatOffset(double lat, double offset, boolean checkOutside) {
    int y = tileSource.latToY((lat + offset), zoom);
    y -= (center.y) - ((getHeight()) / 2);
    if (checkOutside && ((y < 0) || (y > (getHeight())))) {
        return null;
    }
    return y;
}