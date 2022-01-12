private int dip2px(android.content.Context context, float dipValue) {
    final float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((dipValue * scale) + 0.5F));
}