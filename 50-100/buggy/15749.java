public void setConnections(java.util.List<algo.data.structures.WeightedNode<T>> currentNodes, java.util.List<algo.data.structures.Connection<T>> allConnections) {
    for (algo.data.structures.Connection<T> link : allConnections) {
        link.getSource().addChild(link.getDestination(), link.getWeight());
    }
}