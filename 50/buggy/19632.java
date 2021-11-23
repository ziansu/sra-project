private void updateCollapsedGraph() {
    com.intellij.vcs.log.graph.utils.UnsignedBitSet initVisibility = com.intellij.vcs.log.graph.impl.facade.ReachableNodes.getReachableNodes(myPermanentGraphInfo.getLinearGraph(), myIdsOfVisibleBranches);
    myCollapsedGraph = com.intellij.vcs.log.graph.collapsing.CollapsedGraph.newInstance(getDelegateController().getCompiledGraph(), initVisibility);
}