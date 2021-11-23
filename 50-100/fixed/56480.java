public int[] getNodesShortestPathTo(int n) {
    int[] path = new int[getNodeStepsTo(n)];
    int i = (getNodeStepsTo(n)) - 1;
    while (i >= 0) {
        path[i] = n;
        n = predecessors[n];
        i--;
    } 
    return path;
}