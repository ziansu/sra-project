@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int width = com.zzn.aeassistant.view.pla.MeasureSpec.getSize(widthMeasureSpec);
    int height = com.zzn.aeassistant.view.pla.MeasureSpec.getSize(heightMeasureSpec);
    int heightC = (width * (mHeight)) / (mWidth);
    setMeasuredDimension(width, heightC);
}