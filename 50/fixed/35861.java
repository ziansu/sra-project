public void unregisterAll() {
    for (java.lang.Object key : new java.util.HashSet<java.lang.Object>(this.registered.keySet()))
        this.unregister(key);
    
}