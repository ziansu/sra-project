private javafx.scene.chart.XYChart.Series getSeries(javafx.scene.chart.XYChart.Series series, int index) {
    for (int i = 0; i < (red.size()); i++) {
        series.getData().add(new javafx.scene.chart.XYChart.Data(i, stats[index].get(i)));
    }
    return series;
}