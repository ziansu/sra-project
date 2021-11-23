private android.graphics.drawable.GradientDrawable getLayer(int n, android.graphics.drawable.LayerDrawable drawableNormal) {
    return ((android.graphics.drawable.GradientDrawable) (drawableNormal.getDrawable(n).mutate()));
}