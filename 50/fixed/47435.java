public void setClickHighlightingColor(@android.support.annotation.FloatRange(from = 0.0F, to = 1.0F)
float alpha, @android.support.annotation.ColorInt
int highlightingColor) {
    if ((roundedDrawableParams) != null) {
        roundedDrawableParams.setClickHighlightingColor(alpha, highlightingColor);
    }
    updateRoundedDrawableParameters(drawable);
    invalidate();
}