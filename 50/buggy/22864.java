public void onSizeChanged(int width, int height) {
    this.mWidth = width;
    this.mHeight = height;
    if (shouldBlur())
        changeDrawable(mDrawable);
    
}