public boolean setMove(final java.awt.Color color, final int number) {
    for (data.Karte k : spieler.get(activePlayer).getKarten()) {
        if ((k.getFarbe().equals(color)) && ((k.getNummer()) == number)) {
            move(k, spielfeld);
            spieler.get(activePlayer).remove(k);
            return true;
        }
    }
    return false;
}