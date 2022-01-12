private CheckoutCard findMostRecentCard(java.util.Set<CheckoutCard> cards) {
    CheckoutCard mostRecent = cards.iterator().next();
    for (CheckoutCard card : cards) {
        if ((card.getCheckOutDate()) == null) {
            continue;
        }
        if (card.getCheckOutDate().after(mostRecent.getCheckOutDate())) {
            mostRecent = card;
        }
    }
    return mostRecent;
}