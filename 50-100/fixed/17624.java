public void removeEventListener(java.lang.String type, org.kie.api.runtime.process.EventListener eventListener) {
    if ((processEventListeners) != null) {
        java.util.List<org.kie.api.runtime.process.EventListener> eventListeners = processEventListeners.get(type);
        if (eventListeners != null) {
            eventListeners.remove(eventListener);
            if (eventListeners.isEmpty()) {
                processEventListeners.remove(type);
                eventListeners = null;
            }
        }
    }
}