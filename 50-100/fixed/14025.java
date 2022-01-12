@java.lang.Override
public com.hearthsim.util.tree.HearthTreeNode performAction(com.hearthsim.card.Card origin, com.hearthsim.model.PlayerSide playerSide, com.hearthsim.util.tree.HearthTreeNode boardState) {
    com.hearthsim.util.tree.HearthTreeNode toRet = super.performAction(origin, playerSide, boardState);
    if (toRet == null)
        return null;
    
    if (playerSide == (com.hearthsim.model.PlayerSide.CURRENT_PLAYER)) {
        if (toRet instanceof com.hearthsim.util.tree.CardDrawNode) {
            ((com.hearthsim.util.tree.CardDrawNode) (toRet)).addNumCardsToDraw(numCards_);
        }else {
            toRet = new com.hearthsim.util.tree.CardDrawNode(toRet, numCards_);
        }
    }else {
        toRet.data_.drawCardFromWaitingPlayerDeck(numCards_);
    }
    return toRet;
}