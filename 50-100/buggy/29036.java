@java.lang.Override
public void done() {
    java.awt.Toolkit.getDefaultToolkit().beep();
    progressBar.setValue(progressBar.getMaximum());
    progressBar.setStringPainted(false);
    clearTable();
    copyButton.setEnabled(true);
    setTitle(((title) + ": Completed"));
}