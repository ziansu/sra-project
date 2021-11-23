public void setDrawable(@android.support.annotation.NonNull
android.graphics.drawable.Drawable drawable) {
    mDrawable = drawable;
    setBounds(mDrawable.getBounds());
}