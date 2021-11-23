public static int convertDpToPixel(float dp, android.content.Context context) {
    android.content.res.Resources resources = context.getResources();
    android.util.DisplayMetrics metrics = resources.getDisplayMetrics();
    int px = java.lang.Math.round((dp * ((metrics.densityDpi) / (android.util.DisplayMetrics.DENSITY_DEFAULT))));
    return px;
}