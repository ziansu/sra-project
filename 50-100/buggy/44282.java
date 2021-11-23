public static it.gmariotti.cardslib.library.internal.Card createCard(android.app.Activity activity) {
    it.gmariotti.cardslib.library.internal.Card card = new it.gmariotti.cardslib.library.internal.Card(activity);
    it.gmariotti.cardslib.library.internal.CardHeader header2 = new it.gmariotti.cardslib.library.internal.CardHeader(activity);
    header2.setTitle("Angry bird 2: ");
    card.setTitle("sample title 2");
    card.addCardHeader(header2);
    card.setType(2);
    return card;
}