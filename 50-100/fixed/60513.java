private int measureWidth(int measureSpec) {
    int size = 0;
    android.graphics.Rect bounds = new android.graphics.Rect();
    textPaint.getTextBounds(text, 0, text.length(), bounds);
    size += bounds.width();
    size += (com.carlosolmedo.badgeview.BadgeView.convertDpToPixel(com.carlosolmedo.badgeview.BadgeView.BADGE_INNER_PADDING, getContext())) * 2;
    return resolveSizeAndState(size, measureSpec, 0);
}