public void calcPredictedScores() {
    buildNodesAndLinks(true);
    calcPredictedScores(root, root.getActualComp());
}