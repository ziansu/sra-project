private void setSpielHistorie(boolean sieg) {
    spielfolge = "9";
    for (int i = 4; i > 0; i--) {
        bla.Spieler.spielHistorie[i] = bla.Spieler.spielHistorie[(i - 1)];
    }
    if (sieg == true) {
        bla.Spieler.spielHistorie[0] = "Gewonnen";
    }else {
        bla.Spieler.spielHistorie[0] = "Verloren";
    }
}