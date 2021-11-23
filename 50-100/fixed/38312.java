public void removeListenerForKeyTableChange(final java.lang.String className, final de.cismet.belis.gui.widget.KeyTableListener listener) {
    final java.util.Collection<de.cismet.belis.gui.widget.KeyTableListener> listeners = keyTableListeners.get(className.toLowerCase());
    if (listeners != null) {
        listeners.remove(listener);
        if (listeners.isEmpty()) {
            keyTableListeners.remove(className.toLowerCase());
        }
    }
}