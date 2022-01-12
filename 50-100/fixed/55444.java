public int maximumDegree() {
    int max = 0;
    for (int i = 0; i < (numberOfNodes); i++) {
        int inDegree = nodeBuf.getInt(((uk.ac.kent.dover.fastGraph.FastGraph.NODE_IN_DEGREE_OFFSET) + (i * (uk.ac.kent.dover.fastGraph.FastGraph.NODE_BYTE_SIZE))));
        int outDegree = nodeBuf.getInt(((uk.ac.kent.dover.fastGraph.FastGraph.NODE_OUT_DEGREE_OFFSET) + (i * (uk.ac.kent.dover.fastGraph.FastGraph.NODE_BYTE_SIZE))));
        int degree = inDegree + outDegree;
        if (degree > max) {
            max = degree;
        }
    }
    return max;
}