private void modLicenseFieldKeyReleased(java.awt.event.KeyEvent evt) {
    vdscratchy.core.validation.ValidationError error = currentProject.setLicense(modLicenseField.getSelectedItem().toString());
    if ((error.severity) == 1)
        modLicenseField.setBackground(invalidTextFieldInputColor);
    
    if ((error.severity) == 0)
        modLicenseField.setBackground(warningTextFieldInputColor);
    else
        modLicenseField.setBackground(javax.swing.UIManager.getDefaults().getColor("TextField.background"));
    
    modLicenseField.setToolTipText(error.message);
}