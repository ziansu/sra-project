private void modHomePageFieldKeyReleased(java.awt.event.KeyEvent evt) {
    vdscratchy.core.validation.ValidationError error = currentProject.setHomepage(((modHomePageHttpsSelect.getSelectedItem().toString()) + (modHomePageField.getText())));
    if ((error.severity) == 1)
        modHomePageField.setBackground(invalidTextFieldInputColor);
    
    if ((error.severity) == 0)
        modHomePageField.setBackground(warningTextFieldInputColor);
    else
        modHomePageField.setBackground(javax.swing.UIManager.getDefaults().getColor("TextField.background"));
    
    modHomePageField.setToolTipText(error.message);
}