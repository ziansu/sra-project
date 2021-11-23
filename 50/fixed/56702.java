de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung.Geldbetrag subtrahiere(de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung.Geldbetrag subtraktionsBetrag) {
    assert subtraktionsBetrag != null : "Vorbedingung verletzt: subtraktionsBetrag != null";
    _euroBetrag -= subtraktionsBetrag.getEuroBetrag();
    _centBetrag -= subtraktionsBetrag.getCentBetrag();
    haendleCentUeberschuss(this);
    return this;
}