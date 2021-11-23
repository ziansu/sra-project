private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    if (pathTextField.getText().equals("")) {
        jDialog2.setVisible(true);
    }else {
        ui.PatternSelector.selectorGUI sGui = new ui.PatternSelector.selectorGUI();
        sGui.setVisible(true);
        this.dispose();
    }
}