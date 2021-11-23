@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(org.michaelbel.app.cells.MeasureSpec.makeMeasureSpec(org.michaelbel.app.cells.MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.EXACTLY), org.michaelbel.app.cells.MeasureSpec.makeMeasureSpec(org.michaelbel.material.Utils.dp(100), MeasureSpec.EXACTLY));
}