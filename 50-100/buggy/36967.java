public static int index(org.openstreetmap.josm.data.coor.LatLon ll, int level) {
    long noParts = 1 << level;
    long x = ((long) ((((ll.lon()) + 180.0) * noParts) / 360.0)) & 1;
    long y = ((long) ((((ll.lat()) + 90.0) * noParts) / 180.0)) & 1;
    return ((int) ((2 * x) + y));
}