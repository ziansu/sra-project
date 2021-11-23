protected void walkGroups(net.instant.plugins.PluginGroup base, java.util.List<net.instant.plugins.PluginGroup> drain, java.util.Set<net.instant.plugins.PluginGroup> visited) throws net.instant.plugins.GroupConstraintLoopException {
    if (drain.contains(base))
        return ;
    
    if (!(visited.add(base)))
        throw new net.instant.plugins.GroupConstraintLoopException(base, Constraint.AFTER);
    
    java.util.SortedSet<net.instant.plugins.PluginGroup> precs = new java.util.TreeSet<net.instant.plugins.PluginGroup>(base.getPrecedessors());
    for (net.instant.plugins.PluginGroup p : precs)
        walkGroups(p, drain, visited);
    
    drain.add(base);
}