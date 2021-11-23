void updateChart(com.github.mikephil.charting.charts.LineChart chart) {
    if (chart != null) {
        if ((gpxItem.chartMatrix) != null) {
            chart.getViewPortHandler().refresh(new android.graphics.Matrix(gpxItem.chartMatrix), chart, true);
        }
        if ((gpxItem.chartHighlightPos) != (-1)) {
            chart.highlightValue(gpxItem.chartHighlightPos, 0);
        }else {
            chart.highlightValue(null);
        }
    }
}