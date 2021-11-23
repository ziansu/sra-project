public void addNode(java.lang.Long parentId, long id, @zipkin.internal.Nullable
V value) {
    zipkin.internal.Node<V> node = new zipkin.internal.Node<V>().value(value);
    if (parentId == null) {
        if ((rootNode) == null) {
            rootNode = node;
        }else {
            idToNode.put(id, node);
            idToParent.put(id, null);
        }
    }else {
        idToNode.put(id, node);
        idToParent.put(id, parentId);
    }
}