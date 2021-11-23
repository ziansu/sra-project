@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.String tempTXT = message.getText();
    tempTXT = tempTXT + (java.lang.System.lineSeparator());
    message.setText(tempTXT);
}