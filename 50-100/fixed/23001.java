private void loadBindings(java.io.InputStream stream) throws java.io.IOException {
    assert stream != null;
    hotkeyBindings.clear();
    hotkeyBindings.loadFromXML(stream);
    for (java.lang.String keyString : hotkeyBindings.stringPropertyNames()) {
        java.lang.String actionName = hotkeyBindings.getProperty(keyString);
        jme3utilities.ui.Hotkey hotkey = jme3utilities.ui.Hotkey.getInstance(keyString);
        bind(actionName, hotkey);
    }
}