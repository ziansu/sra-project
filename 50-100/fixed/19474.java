public void put(final main.com.valkryst.VcLSM.node.Node<V> node) {
    if (node == null) {
        return ;
    }
    final long estimatedNodeSize = main.com.valkryst.VcLSM.node.NodeInstrumentation.getNodeSize(node);
    if (((currentSize) + estimatedNodeSize) >= (maximumSize)) {
        merge();
    }
    map.put(node.getKeyWithTimestamp(), node);
    currentSize += estimatedNodeSize;
}