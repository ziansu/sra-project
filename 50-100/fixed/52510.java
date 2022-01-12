@java.lang.Override
protected void updateScore(org.ggp.base.player.gamer.statemachine.mctsref.SearchTreeNode<org.ggp.base.player.gamer.statemachine.mctsref.BasicMCTSSearchTree> xiChild, double[] playoutResult) {
    (numVisits)++;
    for (int i = 0; i < (scoreVector.length); i++) {
        scoreVector[i] = (((scoreVector[i]) * (numVisits)) + (playoutResult[i])) / ((numVisits) + 1);
    }
}