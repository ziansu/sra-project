public cfgcoverage.jacoco.analysis.data.CfgNode getNode(int nodeIdx) {
    if (nodeIdx >= (nodeList.size())) {
        return null;
    }
    return nodeList.get(nodeIdx);
}