org.eclipse.jdt.internal.core.nd.util.PathMap.Node<T> createNode(org.eclipse.core.runtime.IPath key) {
    if ((this.depth) == (key.segmentCount())) {
        this.exists = true;
        return this;
    }
    if ((this.children) == null) {
        this.children = new java.util.HashMap<>();
    }
    java.lang.String nextSegment = getSegment(key);
    org.eclipse.jdt.internal.core.nd.util.PathMap.Node<T> next = createChild(nextSegment);
    return next.createNode(key);
}