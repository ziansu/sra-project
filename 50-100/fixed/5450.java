@javafx.fxml.FXML
void addSample() {
    sineWave += 0.1;
    PiSeries.getData().add(new javafx.scene.chart.XYChart.Data<java.lang.Number, java.lang.Number>((((java.lang.System.currentTimeMillis()) - (startTime)) * 2), java.lang.Math.sin(sineWave)));
    if ((xAxis.getUpperBound()) > ((startWave) + (clearWave))) {
        startWave = xAxis.getUpperBound();
        PiSeries.getData().clear();
    }
}