public void setClickHighlightingColor(@android.support.annotation.IntRange(from = 0, to = 100)
int alpha, @android.support.annotation.ColorInt
int highlightingColor) {
    if ((roundedDrawableParams) != null) {
        roundedDrawableParams.setClickHighlightingColor(alpha, highlightingColor);
    }
    updateRoundedDrawableParameters(drawable);
    invalidate();
}