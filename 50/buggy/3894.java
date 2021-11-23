public int getNodeDegree(int nodeIndex) {
    int degree = (java.lang.Short.toUnsignedInt(getNodeInDegree(nodeIndex))) + (java.lang.Short.toUnsignedInt(getNodeOutDegree(nodeIndex)));
    return degree;
}