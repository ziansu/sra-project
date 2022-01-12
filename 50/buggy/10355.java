poker.PlayingCard dealNext() {
    (deal)++;
    poker.PlayingCard toDeal = new poker.PlayingCard();
    toDeal = deck.get(deal);
    return toDeal;
}