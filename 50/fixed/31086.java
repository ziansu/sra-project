public static int px2dp(android.content.Context context, int px) {
    float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((px / scale) + 0.5F));
}