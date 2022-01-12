public void addListenerForKeyTableChange(final java.lang.String className, final de.cismet.belis.gui.widget.KeyTableListener listener) {
    java.util.Collection<de.cismet.belis.gui.widget.KeyTableListener> listeners = keyTableListeners.get(className.toLowerCase());
    if (listeners == null) {
        listeners = new java.util.ArrayList<de.cismet.belis.gui.widget.KeyTableListener>();
        keyTableListeners.put(className, listeners);
    }
    listeners.add(listener);
}