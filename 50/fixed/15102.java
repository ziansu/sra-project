private android.graphics.drawable.GradientDrawable getLayer(int n, android.graphics.drawable.LayerDrawable j) {
    return ((android.graphics.drawable.GradientDrawable) (j.getDrawable(n).mutate()));
}