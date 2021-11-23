private void postFieldUpdate(net.sozinsoft.tokenlab.ui.Config.ConfigEntry configEntry) {
    updateFields();
    if (((!(setPogImageButton.isEnabled())) && (!(setPortraitImageButton.isEnabled()))) && (!(setTokenLocationButton.isEnabled()))) {
        buttonOK.setEnabled(true);
    }
}