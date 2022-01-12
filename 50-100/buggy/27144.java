@java.lang.Override
public void focusLost(java.awt.event.FocusEvent arg0) {
    java.lang.String newValue = ((chess.view.swing.SettingsPanel.SettingsInputField) (arg0.getSource())).getText();
    try {
        vcs.fireVetoableChange(propertyName, value, newValue);
    } catch (java.beans.PropertyVetoException e) {
        this.setBackground(java.awt.Color.RED);
        okButton.setEnabled(false);
        return ;
    }
    pcs.firePropertyChange(propertyName, value, newValue);
    setText(newValue);
    this.setBackground(java.awt.Color.WHITE);
    okButton.setEnabled(true);
}