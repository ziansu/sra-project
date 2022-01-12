public boolean watchLocal(java.lang.String key, com.yaconfig.client.WatcherListener... listeners) {
    if (watchers.containsKey(key)) {
        watchers.get(key).addListeners(listeners);
        return false;
    }else {
        com.yaconfig.client.Watcher watcher = new com.yaconfig.client.Watcher(key, channel);
        watcher.addListeners(listeners);
        synchronized(this.watchers) {
            watchers.put(key, watcher);
        }
    }
    return true;
}