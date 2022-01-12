private void symmetricDifference(java.util.LinkedList<V> augmentingPath) {
    int operation = 0;
    while ((augmentingPath.size()) > 0) {
        E edge = graph.getEdge(augmentingPath.poll(), augmentingPath.peek());
        if ((operation % 2) == 0) {
            matching.add(edge);
        }else {
            matching.remove(edge);
        }
        operation++;
    } 
}