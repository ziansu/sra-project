public int position(int artikelnummer) {
    int i = 0;
    for (; i < (this.artikelListe.size()); i++) {
        if ((this.artikelListe.get(i).getArtikelNummer()) == artikelnummer) {
            return this.artikelListe.get(i).getPosition();
        }else
            return 4;
        
    }
    return this.artikelListe.get(i).getPosition();
}