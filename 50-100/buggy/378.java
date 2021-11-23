public static org.jfree.chart.ChartPanel createBarChart(java.lang.String title, java.lang.String x, java.lang.String y, org.jfree.data.category.DefaultCategoryDataset data) {
    org.jfree.chart.JFreeChart barChart = org.jfree.chart.ChartFactory.createBarChart(title, x, y, data, PlotOrientation.VERTICAL, true, true, false);
    org.jfree.chart.ChartPanel chartPanel = new org.jfree.chart.ChartPanel(barChart);
    return chartPanel;
}