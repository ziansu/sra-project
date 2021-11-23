private static org.jfree.chart.ChartPanel createPieChart(org.jfree.data.general.DefaultPieDataset dataset, java.lang.String title) {
    final org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createPieChart(title, dataset, true, true, false);
    final org.jfree.chart.plot.PiePlot plot = ((org.jfree.chart.plot.PiePlot) (chart.getPlot()));
    plot.setStartAngle(290);
    plot.setDirection(Rotation.CLOCKWISE);
    plot.setForegroundAlpha(0.5F);
    plot.setNoDataMessage("No data to display");
    return new org.jfree.chart.ChartPanel(chart);
}