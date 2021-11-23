public synchronized void removeBasicPlugin(java.lang.Object plugin) {
    basicPlugins.remove(plugin);
    java.util.Set<java.lang.Object> p = plugins;
    if (p != null)
        p.remove(plugin);
    
}