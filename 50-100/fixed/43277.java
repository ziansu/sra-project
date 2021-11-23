private void setCardsForPlayers(java.util.Map<org.jskat.util.Player, org.jskat.util.CardList> cards) {
    for (java.util.Map.Entry<org.jskat.util.Player, org.jskat.util.CardList> playerCards : cards.entrySet()) {
        removeAllCards(playerCards.getKey());
        getPlayerPanel(playerCards.getKey()).addCards(playerCards.getValue());
    }
}