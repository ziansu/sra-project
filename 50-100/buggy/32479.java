@java.lang.Override
protected void updateScore(org.ggp.base.player.gamer.statemachine.mctsref.SearchTreeNode<org.ggp.base.player.gamer.statemachine.mctsref.ARRSearchTree> xiChild, double[] playoutResult) {
    if ((tree.mSuppressBackProp) || (mStopBackPropHere)) {
        tree.mSuppressBackProp = true;
        return ;
    }
    for (int i = 0; i < (scoreVector.length); i++) {
        scoreVector[i] = (((scoreVector[i]) * (numVisits)) + (playoutResult[i])) / ((numVisits) + 1);
    }
}