public void addEventListener(java.lang.String type, org.kie.api.runtime.process.EventListener eventListener) {
    if ((processEventListeners) == null) {
        processEventListeners = new java.util.HashMap<java.lang.String, java.util.List<org.kie.api.runtime.process.EventListener>>();
    }
    java.util.List<org.kie.api.runtime.process.EventListener> eventListeners = processEventListeners.get(type);
    if (eventListeners == null) {
        eventListeners = new java.util.concurrent.CopyOnWriteArrayList<org.kie.api.runtime.process.EventListener>();
        processEventListeners.put(type, eventListeners);
    }
    eventListeners.add(eventListener);
}