private void buildDefaultChart() {
    ds = createBlankDataset();
    this.elevationChart = org.jfree.chart.ChartFactory.createXYLineChart("Height Chart", X_AXIS_LABEL, Y_AXIS_LABEL, ds, PlotOrientation.VERTICAL, true, true, false);
    cp = new org.jfree.chart.ChartPanel(elevationChart, true, true, true, true, true);
    cp.setMouseZoomable(true);
    cp.setMouseWheelEnabled(true);
}