public void connectNode(Main.GraphNode start, Main.GraphNode end) {
    if ((adjMatrix) == null) {
        this.size = nodes.size();
        adjMatrix = new int[size][size];
    }
    int startIndex = nodes.indexOf(start);
    int endIndex = nodes.lastIndexOf(end);
    adjMatrix[startIndex][endIndex] = 1;
    adjMatrix[endIndex][startIndex] = 1;
}