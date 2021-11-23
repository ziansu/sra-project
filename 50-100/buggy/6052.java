protected java.lang.String getLongZone(final double longitude) {
    final double longZone;
    if (longitude < 0.0) {
        longZone = ((180.0 + longitude) / 6) + 1;
    }else {
        longZone = (longitude / 6) + 31;
    }
    java.lang.String val = java.lang.String.valueOf(((int) (longZone)));
    if ((val.length()) == 1) {
        val = "0" + val;
    }
    return val;
}