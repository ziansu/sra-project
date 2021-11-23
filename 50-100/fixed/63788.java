void setFreqAxisMode(github.bewantbe.audio_analyzer_for_android.ScreenPhysicalMapping.Type mapType, float freq_lower_bound_for_log) {
    axisFreq.setMappingType(mapType, freq_lower_bound_for_log);
    if (mapType == (ScreenPhysicalMapping.Type.LOG)) {
        fqGridLabel.setGridType(GridLabel.Type.FREQ_LOG);
    }else {
        fqGridLabel.setGridType(GridLabel.Type.FREQ);
    }
    synchronized(this) {
        logBmp.init(nFreqPoints, nTimePoints, axisFreq);
    }
    synchronized(this) {
        logSegBmp.init(nFreqPoints, nTimePoints, axisFreq);
    }
}