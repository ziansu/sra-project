private model.Player getNextPlayer(model.Player player) {
    if (player == (params.forehand))
        return params.middlehand;
    
    if (player == (params.middlehand))
        return params.rearhand;
    
    if (player == (params.rearhand))
        return params.forehand;
    
    throw new java.lang.IllegalArgumentException("model.Player not present in model.GameParams.");
}