public void queryPOIListUpdate() {
    if ((((currentLocation) == null) || ((currentCompassValue) < 0)) || ((settingsManager.getPresetIdInRouterFragment()) < 1)) {
        return ;
    }
    org.walkersguide.utils.POIPreset preset = settingsManager.getPOIPreset(settingsManager.getPresetIdInRouterFragment());
    boolean isInsidePublicTransport = false;
    if ((numberOfHighSpeeds) > 0)
        isInsidePublicTransport = true;
    
    poiManager.updatePOIList(preset.getId(), preset.getRange(), currentLocation, currentCompassValue, "", isInsidePublicTransport);
}