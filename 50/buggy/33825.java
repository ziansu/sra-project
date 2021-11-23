public static float pxToDp(float px, android.content.Context context) {
    android.content.res.Resources resources = context.getResources();
    android.util.DisplayMetrics metrics = resources.getDisplayMetrics();
    float dp = px / ((metrics.densityDpi) / 160.0F);
    return dp;
}