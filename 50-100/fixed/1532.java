public void handleNewDistanceValue(java.lang.Double pValue) {
    double temp = pValue + (imperialTallyData.getCalibrationValue());
    if (!(imperialTallyData.isValidLength(temp))) {
        playBadSound();
        return ;
    }
    playGoodSound();
    addDataEntry(pValue);
}