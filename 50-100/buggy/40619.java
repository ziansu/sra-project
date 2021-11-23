private il.ac.idc.yonatan.causality.contexttree.NodeLevel getCurrentUpPhaseNodeLevel() {
    il.ac.idc.yonatan.causality.contexttree.ContextTree contextTree = contextTreeManager.getContextTree();
    int upLevelStep = contextTree.getUpLevelStep();
    java.util.LinkedList<il.ac.idc.yonatan.causality.contexttree.NodeLevel> nodeLevels = contextTree.getNodeLevels();
    if (upLevelStep >= (nodeLevels.size())) {
        return null;
    }
    return nodeLevels.get(upLevelStep);
}