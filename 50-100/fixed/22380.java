@java.lang.Override
public void amZug(boolean schlag) {
    if (schlag == true) {
        if ((meldung) != null) {
            meldung.terminate();
        }
        new de.verbund.watten.spielbeginn.Auswahlfenster(de.verbund.watten.konstanten.AuswahlfensterKonst.SCHLAG_WAHL, client);
    }else
        if (schlag == false) {
            new de.verbund.watten.spielbeginn.Auswahlfenster(de.verbund.watten.konstanten.AuswahlfensterKonst.FARBE_WAHL, client);
        }else {
            if ((meldung) == null) {
                meldung = new de.verbund.watten.meldungen.Meldung(de.verbund.watten.konstanten.MeldungKonst.FEHLER, "Falscher Ansageboolean!");
            }else {
                meldung.terminate();
                meldung = new de.verbund.watten.meldungen.Meldung(de.verbund.watten.konstanten.MeldungKonst.FEHLER, "Falscher Ansageboolean!");
            }
        }
    
}