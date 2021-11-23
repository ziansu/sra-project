public Card inspectCard(int k) {
    if ((cards[k]) == null)
        return new Card('M', Card.Suit.hearts);
    
    return cards[k].clone();
}