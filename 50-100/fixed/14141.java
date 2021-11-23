@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    setMeasuredDimension(com.yydcdut.sdlv.MeasureSpec.getSize(widthMeasureSpec), mHeight);
    for (int i = 0; i < (getChildCount()); i++) {
        measureChild(getChildAt(i), widthMeasureSpec, com.yydcdut.sdlv.MeasureSpec.makeMeasureSpec(mHeight, MeasureSpec.EXACTLY));
    }
}