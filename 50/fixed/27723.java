public tutavla.tavla.domain.Pelaaja valitseVari(java.util.ArrayList<tutavla.tavla.domain.Pelaaja> siirtojarjestys) {
    return siirtojarjestys.get(random.nextInt(siirtojarjestys.size()));
}