public void addCard(java.lang.String card) {
    for (com.coach.plugin.hearthstone.deck.Card existing : classCards) {
        if (existing.getName().equals(card)) {
            existing.setAmount(("" + ((java.lang.Integer.parseInt(existing.getAmount())) + 1)));
            return ;
        }
    }
    com.coach.plugin.hearthstone.deck.Card newCard = new com.coach.plugin.hearthstone.deck.Card(card, ("" + 1));
    classCards.add(newCard);
}