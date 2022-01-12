public void renameDeck(final org.dasfoo.delern.models.Deck deck, final java.lang.String newName) {
    deck.setName(newName);
    deck.save(null);
}