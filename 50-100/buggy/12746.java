public int getCaptionHeight() {
    int textWidth = mTextView.getWidth();
    int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels, View.MeasureSpec.EXACTLY);
    int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
    if (textWidth < 1) {
        return 0;
    }
    mTextView.measure(widthMeasureSpec, heightMeasureSpec);
    return mTextView.getMeasuredHeight();
}