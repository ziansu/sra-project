@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    if ((mHeight) > 0) {
        int width = com.yydcdut.sdlv.MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(width, mHeight);
    }
}