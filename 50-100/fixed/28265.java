private void entferneVormerkKarte(de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium medium, de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde kunde) throws de.uni_hamburg.informatik.swt.se2.mediathek.services.verleih.ProtokollierException {
    de.uni_hamburg.informatik.swt.se2.mediathek.materialien.VormerkKarte vormerkKarte = this.getVormerkKarteFuer(medium);
    if ((vormerkKarte != null) && (vormerkKarte.gibKundeFuerIndex(1).equals(kunde))) {
        _protokollierer.protokolliere(VerleihProtokollierer.EREIGNIS_ENTFERNUNG, vormerkKarte);
        vormerkKarte.verleiheAnVormerker();
    }
}