public boolean hasEdge(int edgeNum) {
    try {
        return edgeList[edgeNum];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
        return false;
    }
}