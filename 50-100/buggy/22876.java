private void init() {
    mPaint = new android.graphics.Paint((((android.graphics.Paint.ANTI_ALIAS_FLAG) | (android.graphics.Paint.DITHER_FLAG)) | (android.graphics.Paint.LINEAR_TEXT_FLAG)));
    mPaint.setTextAlign(Paint.Align.CENTER);
    mPaint.setTextSize(40);
    mPaint.setColor(Color.GRAY);
    setPadding(0, 10, 0, 10);
    for (int i = 0; i < (com.coolerfall.widget.lunar.WeekLabelView.DAYS_IN_WEEK); i++) {
        android.graphics.Region region = new android.graphics.Region();
        mWeekRegion[i] = region;
    }
}