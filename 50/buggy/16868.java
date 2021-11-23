@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    int width = com.yydcdut.sdlv.MeasureSpec.getSize(widthMeasureSpec);
    setMeasuredDimension(width, mHeight);
}