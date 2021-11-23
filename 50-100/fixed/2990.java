private void notifyListeners(org.eclipse.smarthome.core.types.State oldState, org.eclipse.smarthome.core.types.State newState) {
    java.util.Set<org.eclipse.smarthome.core.items.StateChangeListener> clonedListeners = null;
    clonedListeners = new java.util.concurrent.CopyOnWriteArraySet<org.eclipse.smarthome.core.items.StateChangeListener>(listeners);
    for (org.eclipse.smarthome.core.items.StateChangeListener listener : clonedListeners) {
        listener.stateUpdated(this, newState);
    }
    if ((newState != null) && (!(newState.equals(oldState)))) {
        for (org.eclipse.smarthome.core.items.StateChangeListener listener : clonedListeners) {
            listener.stateChanged(this, oldState, newState);
        }
    }
}