public void setGraph() {
    java.util.List<javafx.scene.chart.XYChart.Series> dataSet = new java.util.ArrayList<javafx.scene.chart.XYChart.Series>();
    cv.setGraphView(cm.getGraphType(), cm.getGraphTitle(), cm.getMetric(), "Time", cm.getDataSet());
}