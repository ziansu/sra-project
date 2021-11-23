public boolean isValidPlay(final models.Card selectedCard, final models.Player player) {
    if (getCardsInPlay().isEmpty()) {
        return true;
    }
    models.Suit leadSuit = getFirstPlayedCard().getCardSuit();
    if (!(player.getHand().containsSuit(leadSuit))) {
        return true;
    }else {
        return (selectedCard.getCardSuit()) == leadSuit;
    }
}