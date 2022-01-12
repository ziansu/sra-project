protected long getLastModified(com.ibm.jaggr.core.IAggregator aggregator, com.ibm.jaggr.core.impl.layer.ModuleList modules) {
    long result = 0L;
    for (com.ibm.jaggr.core.impl.layer.ModuleList.ModuleListEntry entry : modules) {
        com.ibm.jaggr.core.resource.IResource resource = entry.getModule().getResource(aggregator);
        long lastMod = resource.lastModified();
        result = java.lang.Math.max(result, lastMod);
    }
    return result;
}