@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    int wrapHeight = (h - (getPaddingTop())) - (getPaddingBottom());
    wrapHeight = 480;
    mStaticLayout = new net.studymongolian.mongollibrary.MongolStaticLayout(mText, mTextPaint, wrapHeight, android.view.Gravity.TOP, 1, 0);
}