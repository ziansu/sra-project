private void init() {
    mPaint = new android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG);
    mPaint.setStyle(Paint.Style.STROKE);
    mPaint.setStrokeWidth(15);
    mPaint.setColor(mColor);
    mFullPath = new android.graphics.Path();
    mDrawPath = new android.graphics.Path();
    setOnClickListener(this);
}