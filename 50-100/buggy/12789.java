public int paga_reale_mazziere() {
    fiches = (fiches) - (puntata);
    if ((fiches) < 0) {
        perso = true;
        int buf = fiches;
        fiches = 0;
        return (puntata) + (buf + (puntata));
    }
    return (puntata) * 2;
}