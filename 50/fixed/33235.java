@java.lang.Override
protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
    return (super.verifyDrawable(drawable)) || (drawable == (this.mMarginDrawable));
}