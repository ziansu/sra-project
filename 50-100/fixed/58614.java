@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    width = w;
    height = h;
    resetPoints(mSelectedTabIndex);
    indicator.setLayoutParams(new com.zhou.lawson.slideindicator.LayoutParams(((width) / (size)), ViewGroup.LayoutParams.MATCH_PARENT));
    indicator.invalidate();
}