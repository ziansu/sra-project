public void handleNewDistanceValue(java.lang.Double pValue) {
    double temp = pValue + (imperialTallyData.getCalibrationValue());
    if (!(imperialTallyData.isValidLength(temp))) {
        com.yaboosh.ybtech.lasertally.Tools.playBadSound(parentActivity);
        return ;
    }
    com.yaboosh.ybtech.lasertally.Tools.playGoodSound(parentActivity);
    addDataEntry(pValue);
}