private void loadHotkeyFile(java.lang.String filePath) throws java.io.FileNotFoundException, java.io.IOException {
    assert filePath != null;
    jme3utilities.ui.InputMode.logger.log(java.util.logging.Level.INFO, "Loading hotkey bindings from an XML file at {0}.", jme3utilities.MyString.quote(filePath));
    java.io.FileInputStream stream = null;
    try {
        stream = new java.io.FileInputStream(filePath);
    } catch (java.io.FileNotFoundException exception) {
        throw exception;
    } finally {
        if (stream != null) {
            stream.close();
        }
    }
    loadBindings(stream);
}