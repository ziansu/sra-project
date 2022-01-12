public speciesnetwork.NetworkNode[] getInternalNodesWithOrigin() {
    final int internalNodeCount = (speciationNodeCount) + (reticulationNodeCount);
    final speciesnetwork.NetworkNode[] internalNodes = new speciesnetwork.NetworkNode[internalNodeCount + 1];
    java.lang.System.arraycopy(nodes, leafNodeCount, internalNodes, 0, internalNodeCount);
    internalNodes[internalNodeCount] = getOrigin();
    return internalNodes;
}