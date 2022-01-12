public Card dealCard() {
    java.lang.System.out.print(cards[topCard].toString());
    Card card = cards[topCard].clone();
    cards[topCard] = null;
    (topCard)--;
    return card;
}