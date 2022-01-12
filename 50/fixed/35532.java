public static int mercatorToLatE7(final double mer) {
    return ((int) (java.lang.Math.round(((de.blau.android.util.GeoMath.mercatorToLat(mer)) * 1.0E7))));
}