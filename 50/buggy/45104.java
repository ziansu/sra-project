public com.mikepenz.iconics.IconicsDrawable color(int color) {
    mIconPaint.setAlpha(android.graphics.Color.alpha(color));
    mIconPaint.setColor(color);
    invalidateSelf();
    return this;
}