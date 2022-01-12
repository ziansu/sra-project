void saveAndReloadConfig() {
    try {
        javax.swing.text.Document document = textArea.getDocument();
        qic.util.Util.overwriteFile(qic.util.Config.CONFIG_PROPERTIES_FILENAME, document.getText(0, document.getLength()));
        qic.util.Config.loadConfig();
    } catch (javax.swing.text.BadLocationException | java.io.IOException e) {
        logger.error(("Error while saving to " + (qic.util.Config.CONFIG_PROPERTIES_FILENAME)));
        qic.util.SwingUtil.showError(e);
    }
}