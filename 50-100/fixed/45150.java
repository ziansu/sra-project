public int degreeUsed(int node) {
    int totalEdge = edges.get(node).size();
    int usedEdge = ((degreeMap.get(node)) == null) ? 0 : degreeMap.get(node).totalDegree();
    int unusedEdge = totalEdge - usedEdge;
    if (unusedEdge < 0) {
        throw new java.lang.IllegalArgumentException("Unused edge should not be negative");
    }
    return unusedEdge;
}