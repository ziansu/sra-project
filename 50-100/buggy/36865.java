public static java.util.List<skylordtools.card.utils.Deck> getAllDecks() {
    java.util.List<skylordtools.card.utils.Deck> deckList = new java.util.ArrayList<>();
    for (java.io.File f : skylordtools.card.utils.Deck.getDeckFilesInOrder()) {
        java.lang.String filename = f.getName();
        try {
            skylordtools.card.utils.Deck d = skylordtools.card.utils.Deck.getDeck(filename);
            deckList.add(d);
        } catch (java.io.IOException ioe) {
            java.lang.System.err.println((("Failed to open deck \"" + (f.getName())) + "\"."));
        }
    }
    return deckList;
}