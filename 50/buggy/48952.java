public void setDrawable(android.graphics.drawable.Drawable drawable, io.doist.material.drawable.WrapperDrawable owner) {
    if ((mDrawable) != null) {
        mDrawable.setCallback(null);
    }
    mDrawable = drawable;
    mDrawable.setCallback(owner);
    mChildChangingConfigurations = mDrawable.getChangingConfigurations();
}