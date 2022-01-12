public static int getStyleAttribColorValue(final android.content.Context context, final int attribResId, final int defaultValue) {
    final android.util.TypedValue tv = new android.util.TypedValue();
    final boolean found = context.getTheme().resolveAttribute(attribResId, tv, true);
    if (!found) {
        android.util.Log.d("ThemeUtils", "themed color not found");
        return defaultValue;
    }
    return tv.data;
}