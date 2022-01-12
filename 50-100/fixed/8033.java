public int aggiungi_puntata_reale() {
    fiches = (fiches) - (puntata);
    if ((fiches) < 0) {
        int buf = fiches;
        fiches = 0;
        return (puntata) + (buf + (puntata));
    }
    return (puntata) * 2;
}