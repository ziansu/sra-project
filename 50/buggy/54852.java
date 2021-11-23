public void initIndicator() {
    if ((mIndicatorUtil) == null) {
        mIndicatorUtil = new com.dean.travltotibet.util.ChartIndicatorUtil(this);
    }
    addIndicatorListener(mChartView.getIndicatorListener());
    mChartView.setChartListener(mChartListener);
}