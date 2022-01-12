private void gibKartenAus(de.verbund.watten.spieler.Spieler spieler, int anzahl) {
    for (int i = 0; i < anzahl; i++) {
        spieler.getHand().add(deck.get(0));
        deck.remove(0);
    }
}