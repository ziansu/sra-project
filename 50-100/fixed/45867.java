@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    mHeadView = getChildAt(0);
    if (mHeadView = null) {
        measureChildWithMargins(mHeadView, widthMeasureSpec, 0, MeasureSpec.UNSPECIFIED, 0);
        maxY = mHeadView.getMeasuredHeight();
        mHeadHeight = mHeadView.getMeasuredHeight();
    }
    super.onMeasure(widthMeasureSpec, com.scrollablelayout.MeasureSpec.makeMeasureSpec(((com.scrollablelayout.MeasureSpec.getSize(heightMeasureSpec)) + (maxY)), MeasureSpec.EXACTLY));
}