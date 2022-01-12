private static com.hmrocket.poker.card.Rank getFlushRank(com.hmrocket.poker.card.Suit flushSuit, com.hmrocket.poker.card.Card... cards) {
    if (flushSuit == null)
        throw new java.lang.IllegalArgumentException("FlushSuit can't be null");
    
    for (int i = 1; i < (cards.length); i++) {
        com.hmrocket.poker.card.Card card = cards[i];
        if ((card.getSuit()) == flushSuit) {
            return card.getRank();
        }
    }
    return null;
}