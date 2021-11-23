protected void getAllSuccessors(java.util.Set<net.instant.plugins.PluginGroup> drain) {
    for (net.instant.plugins.PluginGroup g : getSuccessors()) {
        if (!(drain.add(g)))
            continue;
        
        g.getAllPrecedessors(drain);
    }
}