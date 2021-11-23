@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    measureMainView(widthMeasureSpec, heightMeasureSpec);
    mKeyBox.measureKeyboard(mRootViewBound);
    measureDivider();
    measureIndicators();
    setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
}