protected android.graphics.drawable.LayerDrawable getLayersById(@android.support.annotation.DrawableRes
int id) {
    if ((getDrawable(id)) == null) {
        return null;
    }
    return ((android.graphics.drawable.LayerDrawable) (getDrawable(id).mutate()));
}