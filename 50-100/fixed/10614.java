public void reiniciar() throws java.lang.InterruptedException {
    damas_v1.Ficha f = new damas_v1.Ficha("·");
    for (int i = 0; i < (MAXFILAS); i++) {
        for (int j = 0; j < (MAXCOLUMNAS); j++) {
            casillero[i][j] = f;
            setChanged();
        }
    }
}