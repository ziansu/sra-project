public void playTechCard(cards.Tech card) {
    try {
        hero.useResource(card.getPrice());
        addCardToScrapYard(card);
        removeCardFromHand(card);
        move.PlayTechCard move = new move.PlayTechCard(card);
        sendMessageToPlayer(this, new enumMessage.CommandMessage(enumMessage.Commands.MATCH_PLACE_CARD, "Server", move));
        sendMessageToOtherPlayer(this, new enumMessage.CommandMessage(enumMessage.Commands.MATCH_PLAYCARD, "Server", move));
    } catch (exceptionsPacket.InsufficientResourcesException e) {
        enumMessage.CommandMessage error = new enumMessage.CommandMessage(enumMessage.Commands.MATCH_NOT_VALID_MOVE, "Server", e);
        sendMessageToPlayer(this, error);
    }
}