public int[] getIndegree() {
    if ((this.indegree) == null) {
        indegree = new int[this.getVertexCount()];
        for (java.util.LinkedList<java.lang.Integer> vertices : neighbours) {
            for (int neighbour : vertices) {
                (this.indegree[neighbour])++;
            }
        }
    }
    return indegree;
}