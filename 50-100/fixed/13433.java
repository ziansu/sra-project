public void addNode(@zipkin.internal.Nullable
java.lang.Long parentId, long id, V value) {
    zipkin.internal.Node<V> node = new zipkin.internal.Node<V>().value(value);
    if ((parentId == null) && ((rootNode) == null)) {
        rootNode = node;
    }else {
        idToNode.put(id, node);
        idToParent.put(id, parentId);
    }
}