@java.lang.Override
public com.hearthsim.util.tree.HearthTreeNode applyEffect(com.hearthsim.model.PlayerSide targetSide, com.hearthsim.util.tree.HearthTreeNode boardState) {
    if (boardState.data_.modelForSide(targetSide).isHandFull()) {
        return null;
    }
    try {
        com.hearthsim.card.Card newCard = this.cardClass.newInstance();
        boardState.data_.placeCardHand(targetSide, newCard);
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        com.hearthsim.event.effect.EffectHeroAddCardHand.logger.error("Cannot instantiate the card: ", e);
    }
    return boardState;
}