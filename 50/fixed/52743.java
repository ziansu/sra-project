public Card inspectCard(int k) {
    if (((cards[k]) == null) || (k < 0))
        return new Card('M', Card.Suit.hearts);
    
    return cards[k].clone();
}