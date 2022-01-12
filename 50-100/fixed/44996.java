public void addVormerker(de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde vormerker) throws de.uni_hamburg.informatik.swt.se2.mediathek.werkzeuge.vormerken.VormerkException {
    assert !(istVorgemerktVonKunde(vormerker)) : "Vorbedingung verletzt: istVorgemerktVonKunde(vormerker)";
    assert (_vormerkerListe.size()) <= 2 : "Vorbedingung verletzt: _vormerkerListe.size() > 2";
    try {
        _vormerkerListe.put(vormerker);
    } catch (java.lang.IllegalStateException | java.lang.InterruptedException e) {
        throw new de.uni_hamburg.informatik.swt.se2.mediathek.werkzeuge.vormerken.VormerkException("Vormerken fehlgeschlagen");
    }
}