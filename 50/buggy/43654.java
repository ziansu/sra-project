public Card dealCard() {
    Card card = cards[topCard];
    cards[topCard] = null;
    (topCard)--;
    return card.clone();
}