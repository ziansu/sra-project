public void asetaPelaajanNimi(java.lang.String nimi) {
    sovelluslogiikka.haeSiirtojarjestys().get(((kysyttavaPelaaja) - 1)).asetaNimi(nimi);
    sovelluslogiikka.haeSiirtojarjestys().get(((kysyttavaPelaaja) - 1)).asetaIhmiseksi(true);
    (kysyttavaPelaaja)++;
    kyselyteksti = ("Pelaajan " + (kysyttavaPelaaja)) + " nimi?";
    tyhjennaVastaus = true;
    this.pelaajaOnIhminen = true;
}