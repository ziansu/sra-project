public com.github.sandorw.mocabogaso.games.GameMove getMostSimulatedMove() {
    if ((((rootNode) == null) || (!(rootNode.expanded))) || (rootNode.childNodes.isEmpty()))
        return null;
    
    com.github.sandorw.mocabogaso.games.GameMove mostSimulatedMove = null;
    int mostSimulations = -1;
    for (com.github.sandorw.mocabogaso.ai.mcts.MonteCarloSearchTree.SearchTreeNode childNode : rootNode.childNodes) {
        int childSimulations = childNode.getNumSimulations();
        if (childSimulations > mostSimulations) {
            mostSimulations = childSimulations;
            mostSimulatedMove = childNode.appliedMove;
        }
    }
    return mostSimulatedMove;
}