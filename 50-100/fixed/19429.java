@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(org.michaelbel.app.cells.listview.MeasureSpec.makeMeasureSpec(org.michaelbel.app.cells.listview.MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.EXACTLY), org.michaelbel.app.cells.listview.MeasureSpec.makeMeasureSpec(org.michaelbel.material.Utils.dp(getContext(), ((height) + (divider ? 1 : 0))), MeasureSpec.EXACTLY));
}