@java.lang.Override
public void run() {
    try {
        java.io.File imageFile = jFileChooser.getSelectedFile();
        if (imageFile != null) {
            attachImage(imageFile, imageFile.getAbsolutePath());
        }
    } catch (java.lang.Exception e) {
        name.kion.twipstr.gui.NotificationService.errorMessage(e, frameTwipstr);
    } finally {
        btnAttach.setIcon(attachIcon);
        btnAttach.setText("");
        btnAttach.setEnabled(true);
        statusTextArea.requestFocusInWindow();
    }
}