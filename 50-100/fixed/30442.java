public void start() {
    long tStart = java.lang.System.currentTimeMillis();
    while ((((java.lang.System.currentTimeMillis()) - tStart) / 1000) < (com.developersam.ten.ai.MCTS.timeLimitInSeconds)) {
        com.developersam.ten.ai.Node selectedNode = selection();
        com.developersam.ten.game.Board b = expansion(selectedNode);
        for (com.developersam.ten.ai.Node childNode : selectedNode.getChildren()) {
            simulationAndBackProp(childNode, b);
        }
    } 
}