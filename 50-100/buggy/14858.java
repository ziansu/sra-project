private static org.jfree.chart.ChartPanel createProcessingChart() {
    org.jfree.data.time.TimeSeriesCollection dataset = new org.jfree.data.time.TimeSeriesCollection(executable.GraphicInterface.processingData);
    org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createTimeSeriesChart("Processing Inputs", "Time", "Value", dataset, true, true, false);
    final org.jfree.chart.plot.XYPlot plot = chart.getXYPlot();
    plot.setNoDataMessage("No data to display");
    org.jfree.chart.axis.ValueAxis axis = plot.getDomainAxis();
    axis.setAutoRange(true);
    axis.setFixedAutoRange(60000.0);
    org.jfree.chart.ChartPanel label = new org.jfree.chart.ChartPanel(chart);
    return label;
}