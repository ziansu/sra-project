@java.lang.Override
public javafx.scene.Node getConntentNode() {
    if ((border) == null) {
        border = new javafx.scene.layout.BorderPane();
        chartView.drawDefaultAreaChart();
        border.setTop(chartView.getLegend());
        border.setCenter(chartView.getAreaChartRegion());
        border.setStyle(("-fx-background-color: " + (Constants.Color.LIGHT_GREY2)));
    }
    return border;
}