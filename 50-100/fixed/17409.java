@android.support.annotation.Nullable
private android.graphics.drawable.Drawable getTintedIcon(@android.support.annotation.DrawableRes
int drawableRes) {
    android.graphics.drawable.Drawable drawable = android.support.graphics.drawable.VectorDrawableCompat.create(mContext.getResources(), drawableRes, null);
    if (drawable == null)
        return null;
    
    drawable = drawable.mutate();
    android.support.v4.graphics.drawable.DrawableCompat.setTintList(drawable, android.support.v4.content.ContextCompat.getColorStateList(mContext, R.color.tab_icon));
    return drawable;
}