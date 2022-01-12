void setZooms(float xZoom, float xShift, float yZoom, float yShift) {
    if (showFreqAlongX) {
        axisFreq.setZoomShift(xZoom, xShift);
        axisTime.setZoomShift(yZoom, yShift);
    }else {
        axisFreq.setZoomShift(yZoom, yShift);
        axisTime.setZoomShift(xZoom, xShift);
    }
}