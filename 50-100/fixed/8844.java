@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    mProgressDrawerManager.onSizeChanged(w, h);
    mShapeDrawerManager.onSizeChanged(w, h, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    mBlurManager.onSizeChanged(w, h);
}