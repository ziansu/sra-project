public void calculateDirections() {
    int length = 0;
    de.gwvprojekt.algorithm.Node current = goalNode;
    while (current != null) {
        length++;
        current = current.getPredecessor();
    } 
    directions = new int[length];
    current = goalNode;
    for (int i = 1; i <= length; i++) {
        directions[(length - i)] = current.getDirection();
        current = current.getPredecessor();
    }
}