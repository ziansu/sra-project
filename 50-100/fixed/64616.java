private synchronized void expandNode(GS gameState) {
    if ((gameState.isGameOver()) || (expanded))
        return ;
    
    for (GM move : gameState.getAllValidMoves())
        childNodes.add(new SearchTreeNode(move, ((nodeDepth.get()) + 1), this, gameState));
    
    expanded = true;
}