@java.lang.Override
public void deleteMeldung(int index, int sitzungsID) throws Terminkalender.BenutzerException, java.sql.SQLException {
    Terminkalender.Benutzer eingeloggterBenutzer = istEingeloggt(sitzungsID);
    eingeloggterBenutzer.deleteMeldung(index);
    datenbank.deleteMeldung(eingeloggterBenutzer.getMeldungen().get(index).meldungsID);
}