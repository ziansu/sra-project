private void saveSettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {
    if ((game) != null) {
        game.setPaused(true);
    }
    updateGUI();
    java.io.File f = saveDialog("AIrium_settings.ini");
    if (f == null) {
        return ;
    }
    java.lang.String settings = com.mygdx.game.Serializer.serializeSettings(options);
    com.mygdx.game.Serializer.saveToFile(f, settings);
}