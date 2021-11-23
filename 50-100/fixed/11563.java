public void queryPOIListUpdate() {
    org.walkersguide.utils.POIPreset preset = settingsManager.getPOIPreset(settingsManager.getPresetIdInRouterFragment());
    if ((((currentLocation) == null) || ((currentCompassValue) < 0)) || (preset == null)) {
        return ;
    }
    boolean isInsidePublicTransport = false;
    if ((numberOfHighSpeeds) > 0)
        isInsidePublicTransport = true;
    
    poiManager.updatePOIList(preset.getId(), preset.getRange(), currentLocation, currentCompassValue, "", isInsidePublicTransport);
}