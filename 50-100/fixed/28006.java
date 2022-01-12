public static boolean deckExists(java.lang.String deckName) {
    for (java.io.File f : skylordtools.card.utils.Deck.getDeckFiles()) {
        java.lang.String fileName = f.getName();
        if (deckName.equals(fileName.substring(0, (((fileName.length()) - (skylordtools.card.utils.Deck.Extension.length())) - 1)))) {
            return true;
        }
    }
    return false;
}