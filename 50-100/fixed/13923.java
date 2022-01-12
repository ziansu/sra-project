public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if ((raw[0]) == 0) {
        raw[0] = 1;
        csci435.csci435_odbr.RecordFloatingWidget.hideForScreenshot();
        Globals.time_last_event = java.lang.System.currentTimeMillis();
        csci435.csci435_odbr.RecordFloatingWidget.handler.post(csci435.csci435_odbr.RecordFloatingWidget.widget_timer);
        startScreenshots();
        Globals.recording = true;
    }
    sensorDataLogger.togglePaused(isChecked);
}