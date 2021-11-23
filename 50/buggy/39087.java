private org.jfree.chart.JFreeChart getChart(double fitness, int generation) {
    series.add(generation, fitness);
    org.jfree.data.xy.XYSeriesCollection dataset = new org.jfree.data.xy.XYSeriesCollection();
    dataset.addSeries(series);
    return drawChart(dataset);
}