public void maybeExpandNode(GS gameState) {
    if (((nodeResults.getNumSimulations()) >= (NODE_EXPAND_THRESHOLD)) && ((nodeDepth.get()) < (MAX_NODE_DEPTH)))
        expandNode(gameState);
    
}