public synchronized void addBasicPlugin(java.lang.Object plugin) {
    basicPlugins.add(plugin);
    java.util.Set<java.lang.Object> p = plugins;
    if (p != null)
        p.add(plugin);
    
}