public java.util.Set<org.zkoss.bind.sys.LoadBinding> getLoadBindings(java.lang.Object base, java.lang.String prop) {
    final java.util.LinkedHashSet<org.zkoss.bind.sys.LoadBinding> bindings = new java.util.LinkedHashSet<org.zkoss.bind.sys.LoadBinding>();
    final java.util.Set<org.zkoss.bind.sys.tracker.TrackerNode> visited = new java.util.LinkedHashSet<org.zkoss.bind.sys.tracker.TrackerNode>();
    collectLoadBindings(base, prop, bindings, visited);
    return bindings;
}