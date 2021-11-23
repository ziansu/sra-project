public void initIndicator() {
    mIndicatorUtil = new com.dean.travltotibet.util.ChartIndicatorUtil(this);
    addIndicatorListener(mChartView.getIndicatorListener());
    mChartView.setChartListener(mChartListener);
}