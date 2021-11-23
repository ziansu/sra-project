protected android.graphics.drawable.LayerDrawable getLayersById(@android.support.annotation.DrawableRes
int id) {
    return ((android.graphics.drawable.LayerDrawable) (getDrawable(id).mutate()));
}