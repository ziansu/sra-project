@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    pnlNumberSelector.setVisible(false);
    pnlClear.setVisible(false);
    btnSelection.setRolloverIcon(buttonRolloverImages[0]);
    btnSelection.setIcon(buttonImages[0]);
    btnSelection.setPressedIcon(buttonPressedImages[0]);
    btnSelection.setText("0");
    puzzle[selectedColumn][selectedRow] = 0;
    btnSelection.setRolloverEnabled(true);
    btnSelection.setEnabled(false);
    btnSelection.setEnabled(true);
    btnSelection = null;
}