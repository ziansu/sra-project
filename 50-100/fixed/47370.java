public void uitstappen(int t) {
    if ((vtijd) == t) {
        moetUitstappen = false;
        if ((aantalGenomenOverstappen) == (reis.getAantalOverstappen())) {
            reis.addTijd(treinsimulator.Klok.decrementeer(treinsimulator.Klok.getTijd(), beginTijd));
        }else {
            juisteTrein = zoekTrein();
            vtijd = juisteTrein.getVtijd();
        }
    }
}