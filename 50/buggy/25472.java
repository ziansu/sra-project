public void addEdge(int edgeNum) {
    try {
        edgeList[edgeNum] = true;
        (numEdges)++;
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
    }
}