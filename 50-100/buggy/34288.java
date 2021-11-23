public final int lonIndex(int lat, double longitude) {
    longitude = (longitude + (2 * (java.lang.Math.PI))) % (2 * (java.lang.Math.PI));
    return ((int) ((longitude * (map[lat].length)) / (2 * (java.lang.Math.PI))));
}