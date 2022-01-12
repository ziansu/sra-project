private boolean pruefeElfAufHand() {
    for (data.Karte k : spieler.get(activePlayer).getCards()) {
        if ((k.getNummer()) == (control.Spiel.ELF)) {
            if ((activePlayer) == 0) {
                java.lang.System.out.println("Zug nicht moeglich! Elf wird automatisch gelegt!");
            }
            move(k, spielfeld);
            spieler.get(activePlayer).remove(k);
            return true;
        }
    }
    return false;
}