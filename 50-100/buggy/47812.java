private java.lang.Integer nappulaSilmukkaRefaktoroiNimiMyohemmin(java.util.ArrayList<java.lang.Integer> siirrot, java.lang.Integer siirto, tutavla.tavla.logiikka.Pelilogiikka plk, tutavla.tavla.domain.Pelaaja tietokone, int lahtoruutu, int kohderuutu) {
    java.lang.Integer poistettava = -1;
    for (java.lang.Integer s : siirrot) {
        if (s > siirto) {
            plk.siirraNappulaa(tietokone, lahtoruutu, kohderuutu);
            poistettava = siirrot.indexOf(s);
            break;
        }
    }
    return poistettava;
}