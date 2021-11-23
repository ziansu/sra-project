public int paga_reale_mazziere() {
    fiches = (fiches) - (puntata);
    if ((fiches) < 0) {
        perso = true;
        return (puntata) + ((fiches) + (puntata));
    }
    return (puntata) * 2;
}