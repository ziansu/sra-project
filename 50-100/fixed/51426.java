@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    java.lang.System.out.println("onMeasure");
    measureHeight(heightMeasureSpec);
    if ((mTextWidth) == 0)
        GetTextInfo();
    
    setMeasuredDimension(mTextWidth, mTextHeight);
    if ((oldwidth) != (getWidth())) {
        oldwidth = getWidth();
        if ((mHandler) != null)
            mHandler.sendEmptyMessage(com.warchaser.test.util.VerticalTextView.LAYOUT_CHANGED);
        
    }
}