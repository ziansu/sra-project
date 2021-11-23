void setZooms(float xZoom, float xShift, float yZoom, float yShift) {
    android.util.Log.i(github.bewantbe.audio_analyzer_for_android.SpectrogramPlot.TAG, "setZooms()");
    if (showFreqAlongX) {
        axisFreq.setZoomShift(xZoom, xShift);
        axisTime.setZoomShift(yZoom, yShift);
    }else {
        axisFreq.setZoomShift(yZoom, yShift);
        axisTime.setZoomShift(xZoom, xShift);
    }
}