private void addDiscardedDataPoints(final javafx.scene.chart.XYChart.Series<java.lang.Number, java.lang.Number> discardedDataSeries) {
    int count = 0;
    for (int index : discardedIndices) {
        javafx.scene.chart.XYChart.Data<java.lang.Number, java.lang.Number> dataPoint = new javafx.scene.chart.XYChart.Data<java.lang.Number, java.lang.Number>(discardedCoordinates[0][count], discardedCoordinates[1][count]);
        dataPoint.setExtraValue(index);
        discardedDataSeries.getData().add(dataPoint);
        count++;
    }
}