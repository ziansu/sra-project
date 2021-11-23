public void solve(Node pine) {
    Node next;
    while (someNodesNotPassed()) {
        solution.add(pine);
        pine.setPassed(true);
        next = findNearestTo(pine);
        dist += pine.distanceTo(next);
        java.lang.System.out.println(dist);
        pine = next;
    } 
    dist += pine.distanceTo(firstNode);
}