private void updateGraph(int phase, java.time.LocalDateTime phasetime) {
    (this.phaseCounter)++;
    int min = phasetime.getMinute();
    int sec = phasetime.getSecond();
    double timer = min + (sec / 60.0);
    this.phases[(phase - 1)].getData().add(new javafx.scene.chart.XYChart.Data<>(((double) (this.phaseCounter)), timer));
}