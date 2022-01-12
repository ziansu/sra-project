@java.lang.Override
protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    final android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
    if ((layoutParams.width) == (ViewGroup.LayoutParams.WRAP_CONTENT)) {
        setMeasuredDimension(mRandomTextHelper.getWidthMeasureDrawText(), mRandomTextHelper.getHeightMeasureDrawText());
    }
}