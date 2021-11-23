de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung.Geldbetrag multipliziere(int faktor) {
    assert faktor > 0 : "Vorbedingung verletzt: faktor > 0";
    _euroBetrag *= faktor;
    _centBetrag *= faktor;
    haendleCentUeberschuss(this);
    return this;
}