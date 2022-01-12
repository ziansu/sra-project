public void macheZug(spiel.Zug z) {
    if (this.moeglZuege(z.getAltX(), z.getAltY(), false).contains(z)) {
        this.zuegeBisher.add(z);
        feld[z.getNeuX()][z.getNeuY()] = feld[z.getAltX()][z.getAltY()];
        feld[z.getAltX()][z.getAltY()] = null;
    }
}