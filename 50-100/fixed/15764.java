private void initChart() {
    chart.setLegendSide(javafx.geometry.Side.LEFT);
    chart.setLegendVisible(true);
    if ((chart.getXAxis()) instanceof javafx.scene.chart.NumberAxis) {
        ((javafx.scene.chart.NumberAxis) (chart.getXAxis())).setForceZeroInRange(false);
    }
    chart.setData(seriesList);
    chart.setTitle(tbPresenter.getSelectedMetric().getTitle());
}