public cfgcoverage.jacoco.analysis.data.CfgNode getNode(int nodeIdx) {
    if (nodeIdx >= ((nodeList.size()) - 1)) {
        return null;
    }
    return nodeList.get(nodeIdx);
}