public short getNodeInDegree(int nodeIndex) {
    short degree = nodeBuf.getShort(((uk.ac.kent.dover.fastGraph.FastGraph.NODE_IN_DEGREE_OFFSET) + (nodeIndex * (uk.ac.kent.dover.fastGraph.FastGraph.NODE_BYTE_SIZE))));
    return degree;
}