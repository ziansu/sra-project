@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    try {
        textArea.setEnabled(false);
        FileUtils.saveFileContents(textArea.getText(), parent.getCurrentFilePath());
    } catch (java.io.IOException ex) {
        ExceptionDialog dialog = new ExceptionDialog(parent, ex);
    } finally {
        textArea.setEnabled(true);
    }
}