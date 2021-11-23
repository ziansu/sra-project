private int getDistance(algo.data.structures.SingleLinkedList<algo.data.structures.GraphNode<T>> path) {
    int distance = 0;
    int counter = 0;
    while (counter < (path.count())) {
        algo.data.structures.WeightedNode<T> source = getCurrentNode(path.get(counter));
        ++counter;
        if (counter < (path.count())) {
            algo.data.structures.WeightedNode<T> destination = getCurrentNode(path.get(counter));
            distance += source.getWeight(destination);
        }
    } 
    return distance;
}