private void init() {
    setGravity(Gravity.CENTER);
    setDrawingCacheEnabled(true);
    mPaint = new android.graphics.Paint();
    mPaint.setAntiAlias(true);
    mPaint.setTextAlign(Paint.Align.CENTER);
    mPaint.setTextSize(mTextSize);
    mPaint.setStyle(Paint.Style.FILL);
    mBgCircle = new com.lsxiao.library.Circle(mRadius, mRadius, mRadius);
}