private void initAttr(android.content.Context context, android.util.AttributeSet attrs) {
    mPaint = new android.graphics.Paint();
    matrix = new android.graphics.Matrix();
    mPaint.setTextAlign(Paint.Align.CENTER);
    mPaint.setAntiAlias(true);
    mPaint.setColor(Color.BLACK);
    try {
        mFontSize = java.lang.Float.parseFloat(attrs.getAttributeValue(null, "textSize"));
    } catch (java.lang.Exception e) {
    }
    mPaint.setTypeface(uk.co.chrisjenx.calligraphy.TypefaceUtils.load(context.getAssets(), "fonts/jianshi_default.otf"));
}