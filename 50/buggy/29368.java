public void setProgressChangeListeners(java.util.concurrent.CopyOnWriteArrayList<com.mapbox.services.android.navigation.v5.listeners.ProgressChangeListener> progressChangeListeners) {
    this.progressChangeListeners = progressChangeListeners;
    progressChangeListeners.add(this);
    if ((navigationEngine) != null) {
        navigationEngine.setProgressChangeListeners(progressChangeListeners);
    }
}