@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    mWidth = java.lang.Math.min(getMeasuredHeight(), getMeasuredWidth());
    if (!(once)) {
        initBitmap();
        initItem();
        checkTimeEnable();
        once = true;
    }
    setMeasuredDimension(mWidth, mWidth);
}