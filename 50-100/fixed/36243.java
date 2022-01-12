private int demote(WAVLTree.WAVLNode node, int rebalancingCounter) {
    if (isLeaf(node)) {
        node.rankDiff += 1;
        rebalancingCounter += 1;
        if ((node.rankDiff) == 2) {
            return rebalancingCounter;
        }else {
        }
    }
    if ((node.rankDiff) == 2) {
        return rebalancingCounter;
    }else
        if ((node.rankDiff) == 3) {
        }
    
    return 0;
}