@java.lang.SuppressWarnings(value = "UnusedDeclaration")
public static float pxToDp(float px, android.content.Context context) {
    android.content.res.Resources resources = context.getResources();
    android.util.DisplayMetrics metrics = resources.getDisplayMetrics();
    return px / ((metrics.densityDpi) / 160.0F);
}