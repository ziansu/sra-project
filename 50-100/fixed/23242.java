private void onOK() {
    try {
        if ((com.doos.commons.registry.RegistryManager.isAutoUpdateActive()) != (autoUpdateEnabledCheckBox.isSelected())) {
            com.doos.commons.registry.RegistryManager.setAutoUpdateActive(autoUpdateEnabledCheckBox.isSelected());
        }
    } catch (com.doos.commons.registry.RegistryException e) {
        com.doos.webloc_opener.gui.SettingsDialog.log.warn("Can not save settings change", e);
        javax.swing.JOptionPane.showMessageDialog(null, errorMessage, canNotSaveSettingsToRegistryMessage, javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    dispose();
}