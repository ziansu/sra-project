public void addEventListener(java.lang.String type, org.kie.api.runtime.process.EventListener eventListener) {
    java.util.List<org.kie.api.runtime.process.EventListener> eventListeners = processEventListeners.get(type);
    if (eventListeners == null) {
        synchronized(processEventListeners) {
            eventListeners = processEventListeners.get(type);
            if (eventListeners == null) {
                eventListeners = new java.util.concurrent.CopyOnWriteArrayList<org.kie.api.runtime.process.EventListener>();
                processEventListeners.put(type, eventListeners);
            }
        }
    }
    eventListeners.add(eventListener);
}