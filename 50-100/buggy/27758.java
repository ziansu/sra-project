private void regexMatchCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
    if (regexMatchCheckBox.isSelected()) {
        caseSensitiveCheckBox.setEnabled(false);
        caseSensitiveCheckBox.setSelected(false);
        exactMatchCheckBox.setEnabled(false);
        exactMatchCheckBox.setSelected(false);
        instantSearchCheckBox.setEnabled(false);
        instantSearchCheckBox.setSelected(false);
    }else {
        caseSensitiveCheckBox.setEnabled(true);
        exactMatchCheckBox.setEnabled(true);
        instantSearchCheckBox.setEnabled(true);
    }
}