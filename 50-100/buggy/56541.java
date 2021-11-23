public void addAllKeys(java.util.Set<org.eclipse.core.runtime.IPath> result, org.eclipse.core.runtime.IPath parent) {
    if (this.exists) {
        result.add(parent);
    }
    for (java.util.Map.Entry<java.lang.String, org.eclipse.jdt.internal.core.nd.util.PathMap.Node<T>> next : this.children.entrySet()) {
        java.lang.String key = next.getKey();
        org.eclipse.core.runtime.IPath nextPath = buildChildPath(parent, key);
        next.getValue().addAllKeys(result, nextPath);
    }
}