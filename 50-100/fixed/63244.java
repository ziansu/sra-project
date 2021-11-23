private void modRepoFieldKeyReleased(java.awt.event.KeyEvent evt) {
    vdscratchy.core.validation.ValidationError error = currentProject.setModRepository(modRepoField.getText());
    if ((error.severity) == 1)
        modRepoField.setBackground(invalidTextFieldInputColor);
    else
        if ((error.severity) == 0)
            modRepoField.setBackground(warningTextFieldInputColor);
        else
            modRepoField.setBackground(javax.swing.UIManager.getDefaults().getColor("TextField.background"));
        
    
    modRepoField.setToolTipText(error.message);
}