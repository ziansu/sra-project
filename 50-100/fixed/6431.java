@java.lang.Override
public void setMode(java.lang.String mode) {
    if (mode == null) {
        mode = new java.lang.String("month");
    }
    if (mode.equals("month")) {
        currentMode = de.rtcustomz.getraenkeautomat.client.charts.LineChartPage.Mode.MONTH;
        daySelect.setVisible(false);
    }else
        if (mode.equals("day")) {
            currentMode = de.rtcustomz.getraenkeautomat.client.charts.LineChartPage.Mode.DAY;
            daySelect.setVisible(true);
        }
    
    modeSelect.setSelectedIndex(currentMode.ordinal());
}