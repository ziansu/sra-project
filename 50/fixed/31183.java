protected int dip2px(android.content.Context context, float dpValue) {
    final float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((dpValue * scale) + 0.5F));
}