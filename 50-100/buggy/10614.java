public void reiniciar() throws java.lang.InterruptedException {
    damas_v1.Ficha f = new damas_v1.Ficha("·");
    damas_v1.FichaSwing fswing;
    for (int i = 0; i < (MAXFILAS); i++) {
        for (int j = 0; j < (MAXCOLUMNAS); j++) {
            casillero[i][j] = f;
            fswing = new damas_v1.FichaSwing(((i * 10) + j), null);
            setChanged();
            notifyObservers(fswing);
        }
    }
}