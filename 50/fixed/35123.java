private void zoomFull() {
    for (org.jfree.chart.axis.ValueAxis axis : valueAxisList) {
        axis.setAutoRange(true);
    }
}