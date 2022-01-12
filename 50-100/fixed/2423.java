public model.Player getWinningPlayer(model.Card winningCard) {
    if (params.forehand.getCards().contains(winningCard))
        return params.forehand;
    
    if (params.middlehand.getCards().contains(winningCard))
        return params.middlehand;
    
    if (params.rearhand.getCards().contains(winningCard))
        return params.rearhand;
    
    throw new java.lang.RuntimeException("No player has the winning card, something went horribly wrong.");
}