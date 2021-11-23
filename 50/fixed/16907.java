private static org.jfree.chart.JFreeChart createChart(org.jfree.data.general.PieDataset dataset) {
    org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createPieChart("Wykonane / Niewykonane ", dataset, false, true, false);
    return chart;
}