private java.util.ArrayList<Node> getMovableNeighbours() {
    java.util.ArrayList<Node> movableNeighbours = new java.util.ArrayList<Node>();
    for (Node node : currNode.getNeighbours()) {
        if (!(path.contains(node))) {
            movableNeighbours.add(node);
        }
    }
    return movableNeighbours;
}