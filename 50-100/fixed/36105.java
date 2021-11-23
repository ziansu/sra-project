private void updateTextSize() {
    float size = 14.0F;
    android.graphics.Rect bounds = new android.graphics.Rect(0, 0, 0, 0);
    mTextPaint.setTextSize(size);
    mTextPaint.getTextBounds("00", 0, 1, bounds);
    while ((bounds.height()) < ((mHeight) - ((mHeight) * 0.2F))) {
        mTextPaint.setTextSize((size++));
        mTextPaint.getTextBounds("AA", 0, 1, bounds);
    } 
}