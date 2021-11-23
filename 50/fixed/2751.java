@java.lang.Override
public void focusGained(java.awt.event.FocusEvent e) {
    temp = textFields[finalTempNr].getText();
    textFields[finalTempNr].setText("");
}