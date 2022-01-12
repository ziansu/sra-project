int getLongZone(final double longitude) {
    final double longZone;
    if (longitude < 0.0) {
        longZone = ((180.0 + longitude) / 6) + 1;
    }else {
        longZone = (longitude / 6) + 31;
    }
    return ((int) (longZone));
}