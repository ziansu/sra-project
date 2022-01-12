public void onEventFired(java.lang.String event, java.lang.String data) {
    java.util.HashMap<java.lang.Integer, org.appcelerator.kroll.KrollEventCallback> listeners = eventListeners.get(event);
    if (listeners != null) {
        for (java.lang.Integer listenerId : listeners.keySet()) {
            org.appcelerator.kroll.KrollEventCallback callback = listeners.get(listenerId);
            if (callback != null) {
                callback.call(data);
            }
        }
    }
}