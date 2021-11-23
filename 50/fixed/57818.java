org.eclipse.jdt.internal.core.nd.util.PathMap.Node<T> getChild(java.lang.String nextSegment) {
    if ((this.children) == null) {
        return null;
    }
    return this.children.get(nextSegment);
}