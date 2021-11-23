public void unregisterAll() {
    for (java.lang.Object key : this.registered.keySet())
        this.unregister(key);
    
}