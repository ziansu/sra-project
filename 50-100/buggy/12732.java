@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    if (alwaysCheckBox.isSelected()) {
        startDateTxtField.setText("ALWAYS");
        periodTxtField.setText("ALWAYS");
        periodTxtField.setEnabled(false);
        startDateTxtField.setEnabled(false);
    }else {
        startDateTxtField.setText("");
        periodTxtField.setText("");
        periodTxtField.setEnabled(true);
        startDateTxtField.setEnabled(true);
    }
}