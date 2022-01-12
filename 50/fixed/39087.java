private org.jfree.chart.JFreeChart getChart() {
    org.jfree.data.xy.XYSeriesCollection dataset = new org.jfree.data.xy.XYSeriesCollection();
    dataset.addSeries(series);
    return drawChart(dataset);
}