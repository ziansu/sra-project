private static boolean allNodesVisited(int[] visitedNodes) {
    boolean allVisited = true;
    for (int i = 0; i < (visitedNodes.length); i++) {
        if ((visitedNodes[i]) == 0) {
            allVisited = false;
            break;
        }
    }
    return allVisited;
}