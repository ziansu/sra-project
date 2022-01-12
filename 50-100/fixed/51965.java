@java.lang.Override
protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    final android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
    if ((ViewGroup.LayoutParams.WRAP_CONTENT) == (layoutParams.width)) {
        setMeasuredDimension(mRandomTextHelper.getWidthMeasureDrawText(), mRandomTextHelper.getHeightMeasureDrawText());
    }
}