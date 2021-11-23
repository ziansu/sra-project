private void createArsfestFinishedCard() {
    dk.dtu.arsfest.cards.PostEventCard card = new dk.dtu.arsfest.cards.PostEventCard(this);
    cards.add(0, card);
    it.gmariotti.cardslib.library.internal.CardArrayAdapter cardArrayAdapter = new it.gmariotti.cardslib.library.internal.CardArrayAdapter(this, cards);
    it.gmariotti.cardslib.library.view.CardListView cardsView = ((it.gmariotti.cardslib.library.view.CardListView) (findViewById(R.id.arsfest_events_list)));
    if (cardsView != null)
        cardsView.setAdapter(cardArrayAdapter);
    
}