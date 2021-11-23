public int aggiungi_puntata_reale() {
    fiches = (fiches) - (2 * (puntata));
    if ((fiches) < 0) {
        int buf = fiches;
        fiches = 0;
        return (puntata) + (buf + (puntata));
    }
    return (puntata) * 2;
}