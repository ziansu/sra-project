public void solve(Node pine) {
    Node next;
    while (someNodesNotPassed()) {
        solution.add(pine);
        pine.setPassed(true);
        next = findNearestTo(pine);
        dist += pine.distanceTo(next);
        pine = next;
    } 
    dist += pine.distanceTo(firstNode);
}