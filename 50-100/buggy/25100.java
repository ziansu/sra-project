public void setOrder(E source, E target) {
    org.geotools.PartiallyOrderedSet<E>.DirectedGraphNode<E> sourceNode = elementsToNodes.get(source);
    org.geotools.PartiallyOrderedSet<E>.DirectedGraphNode<E> targetNode = elementsToNodes.get(target);
    if (sourceNode == null) {
        throw new java.lang.IllegalArgumentException(("Could not find source node in the set: " + source));
    }
    if (targetNode == null) {
        throw new java.lang.IllegalArgumentException(("Could not find target node in the set: " + target));
    }
    sourceNode.addOutgoing(targetNode);
}