public int getNodeDegree(int nodeIndex) {
    int degree = (getNodeInDegree(nodeIndex)) + (getNodeOutDegree(nodeIndex));
    return degree;
}