private void populateSeries(java.util.ArrayList<java.lang.Double> list) {
    for (int i = 0; i < (list.size()); i++) {
        series.getData().add(new javafx.scene.chart.XYChart.Data(i, list.get(i)));
    }
}