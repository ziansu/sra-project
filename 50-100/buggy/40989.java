private void clearOldSelection() {
    for (org.moxieapps.gwt.highcharts.client.PlotLine plotLine : selectedDevices.values()) {
        fibreChart.getXAxis().removePlotLine(plotLine);
    }
    selectedDevices.clear();
    if ((map) != null) {
        map.reset(true);
    }
    if ((fibreChart.getNativeChart()) != null) {
        zoomOut(fibreChart.getNativeChart());
        deviceChart.zoomOut();
    }
}