private void switchMeasureMode() {
    if (isMeasureDistance) {
        btnMeasureDistance.setBackgroundResource(R.drawable.bg_save_selector);
        btnMeasureHeight.setBackground(null);
        tvDistanceTitle.setText("测得距离");
        tvHeightTitle.setText("输入预计高度(米)");
    }else {
        btnMeasureHeight.setBackgroundResource(R.drawable.bg_save_selector);
        btnMeasureDistance.setBackground(null);
        tvHeightTitle.setText("测得高度");
        tvDistanceTitle.setText("输入预计距离(米)");
    }
}