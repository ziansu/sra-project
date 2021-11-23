private static boolean allNodesVisited(boolean[] visitedNodes) {
    boolean allVisited = true;
    for (int i = 0; i < (visitedNodes.length); i++) {
        if (!(visitedNodes[i])) {
            allVisited = false;
            break;
        }
    }
    return allVisited;
}