public org.eclipse.jdt.internal.core.nd.util.PathMap.Node<T> createChild(java.lang.String nextSegment) {
    if ((this.children) == null) {
        this.children = new java.util.HashMap<>();
    }
    org.eclipse.jdt.internal.core.nd.util.PathMap.Node<T> next = this.children.get(nextSegment);
    if (next == null) {
        next = new org.eclipse.jdt.internal.core.nd.util.PathMap.Node<>(((this.depth) + 1));
        this.children.put(nextSegment, next);
    }
    return next;
}