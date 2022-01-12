private void init() {
    setGravity(Gravity.CENTER);
    setDrawingCacheEnabled(true);
    mPaint = new android.graphics.Paint();
    mPaint.setAntiAlias(true);
    mPaint.setColor(mCircleColor);
    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setTextAlign(Paint.Align.CENTER);
    mPaint.setTextSize(mTextSize);
    mBgCircle = new com.lsxiao.library.Circle(mRadius, mRadius, mRadius);
}