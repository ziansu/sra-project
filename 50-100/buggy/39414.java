public static int xToLonE7(final int screenWidth, final de.blau.android.osm.BoundingBox viewBox, final float x) {
    return ((int) (((((double) (x)) / ((double) (screenWidth))) * (viewBox.getWidth())) + (viewBox.getLeft())));
}