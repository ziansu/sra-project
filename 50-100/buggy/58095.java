public void actionPerformed(java.awt.event.ActionEvent evt) {
    int value = (no.ntnu.thermalcamcontrol.gui.EnhancePanel.DDE_MAX) + 1;
    try {
        value = java.lang.Integer.parseInt(aceTextField.getText());
    } catch (java.lang.NumberFormatException error) {
        ddeTextField.setText(java.lang.String.valueOf(getAce()));
    }
    if (gui.isWithinRange(no.ntnu.thermalcamcontrol.gui.EnhancePanel.DDE_MIN, no.ntnu.thermalcamcontrol.gui.EnhancePanel.DDE_MAX, value)) {
        ddeSlider.setValue(value);
    }else {
        ddeTextField.setText(java.lang.String.valueOf(getAce()));
    }
}