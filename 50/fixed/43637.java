public static int dp2px(android.content.Context context, float dp) {
    android.content.res.Resources r = context.getResources();
    float px = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
    return java.lang.Math.round(px);
}