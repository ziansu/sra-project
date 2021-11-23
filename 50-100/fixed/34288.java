public final int lonIndex(int lat, double longitude) {
    if (longitude < 0)
        longitude = (2 * (java.lang.Math.PI)) - ((-longitude) % (2 * (java.lang.Math.PI)));
    
    if (longitude >= (2 * (java.lang.Math.PI)))
        longitude = longitude % (2 * (java.lang.Math.PI));
    
    return ((int) ((longitude * (map[lat].length)) / (2 * (java.lang.Math.PI))));
}