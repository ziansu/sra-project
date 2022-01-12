@java.lang.Override
public de.uni_hamburg.informatik.swt.se2.mediathek.materialien.VormerkKarte getVormerkKarteFuer(de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium medium) {
    assert mediumImBestand(medium) : "Vorbedingung verletzt: medienImBestand(medien)";
    return _vormerkKarten.get(medium);
}