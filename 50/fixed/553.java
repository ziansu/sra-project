public double berechneZinsaufwand() {
    zinsaufwand = (((annuitaet) * (laufzeit)) - (hoehe)) / (laufzeit);
    zinsaufwand = (java.lang.Math.round((100.0 * (zinsaufwand)))) / 100.0;
    return zinsaufwand;
}