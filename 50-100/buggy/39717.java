private int getDistance(algo.data.structures.SingleLinkedList<algo.data.structures.GraphNode<T>> path) {
    int distance = 0;
    java.util.Iterator<algo.data.structures.GraphNode<T>> allNodes = path.iterator();
    while (allNodes.hasNext()) {
        algo.data.structures.WeightedNode<T> source = getCurrentNode(allNodes.next());
        if (allNodes.hasNext()) {
            algo.data.structures.WeightedNode<T> destination = getCurrentNode(allNodes.next());
            distance += source.getWeight(destination);
        }
    } 
    return distance;
}