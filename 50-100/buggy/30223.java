protected long getLastModified(com.ibm.jaggr.core.IAggregator aggregator, com.ibm.jaggr.core.impl.layer.ModuleList modules) {
    long result = 0L;
    for (com.ibm.jaggr.core.impl.layer.ModuleList.ModuleListEntry entry : modules) {
        com.ibm.jaggr.core.resource.IResource resource = entry.getModule().getResource(aggregator);
        long lastMod = resource.lastModified();
        if ((lastMod == 0) && (!(resource.exists()))) {
            lastMod = java.lang.Long.MAX_VALUE;
        }
        result = java.lang.Math.max(result, lastMod);
    }
    return result;
}