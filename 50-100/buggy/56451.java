@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    android.graphics.Rect padding = new android.graphics.Rect();
    mSelectionHighlight.getPadding(padding);
    final int desiredHeight = ((((int) (mPaint.getTextSize())) + (mVerticalPadding)) + (padding.top)) + (padding.bottom);
    setMeasuredDimension(widthMeasureSpec, resolveSize(desiredHeight, heightMeasureSpec));
}