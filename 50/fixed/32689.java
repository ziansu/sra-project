public scondor.packets.CardList generateCardList(java.lang.String params) {
    java.util.List<scondor.deck.card.CardData> c = new java.util.ArrayList<>();
    for (int card : cards)
        c.add(scondor.deck.card.CardLoader.getCardData(card));
    
    return new scondor.packets.CardList(c, params);
}