@java.lang.Override
protected void drawCharts() {
    plotSelection.setSelectedIndex(0);
    chart = magChart;
    chartPanel.setChart(chart);
    chartPanel.setMouseZoomable(true);
}