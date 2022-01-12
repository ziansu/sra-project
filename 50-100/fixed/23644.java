private java.util.Set<ServiceNode> discoverService(java.util.Collection<ServiceNode> services, java.util.Set<java.lang.String> searchSet, int layer) {
    java.util.Set<ServiceNode> found = new java.util.HashSet<ServiceNode>();
    for (ServiceNode s : services) {
        if (isSubsumed(s.getInputs(), searchSet)) {
            found.add(s);
            s.setLayer(layer);
        }
    }
    return found;
}