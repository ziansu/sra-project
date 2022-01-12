private float measureSummaryWidth(android.view.View v) {
    float summaryWidth = 0.0F;
    com.snowble.android.verticalstepper.VerticalStepper.LayoutParams lp = com.snowble.android.verticalstepper.VerticalStepper.getInternalLayoutParams(v);
    java.lang.String summary = lp.summary;
    if ((!(android.text.TextUtils.isEmpty(summary))) && (!(lp.active))) {
        summaryWidth = summaryTextPaint.measureText(summary);
    }
    return summaryWidth;
}