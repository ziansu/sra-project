public void updateScreen() {
    disableButton.enabled = ((selected) > 0) && ((selected) < (entityList.size()));
    enableButton.enabled = ((selected) > 0) && ((selected) < (entityList.size()));
    com.biggestnerd.civradar.Config config = CivRadar.instance.getConfig();
    config.setIconOpacity(opacitySlider.getCurrentValue());
    CivRadar.instance.saveConfig();
    opacitySlider.updateDisplayString();
}