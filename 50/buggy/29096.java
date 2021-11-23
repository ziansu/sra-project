public void setBgColor(int bgColor) {
    this.bgColor = bgColor;
    if ((mSurfaceHolder) != null) {
        setZOrderOnTop(true);
        mSurfaceHolder.setFormat(PixelFormat.TRANSLUCENT);
        setBackgroundColor(this.bgColor);
    }
}