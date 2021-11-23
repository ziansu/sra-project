public void classifica() {
    int i = elencoGiocatori.size();
    while (i > 0) {
        classificaFinale.addElement(elencoGiocatori.get(ilPiuPovero()));
        elencoGiocatori.remove(elencoGiocatori.get(ilPiuPovero()));
        i--;
    } 
}