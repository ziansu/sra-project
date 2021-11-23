public io.exis.cards.cards.Card dealCard(io.exis.cards.cards.Player player) {
    io.exis.cards.cards.Card card = generateCard();
    card.PID = player.getPlayerID();
    deck.remove(card);
    player.hand.add(card);
    inPlay.add(card);
    riffle.sendCard(player.getPlayerID(), card);
    return card;
}