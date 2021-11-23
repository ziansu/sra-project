public void nextTurn() {
    switch (Phase) {
        case STARTPHASE :
            (startphaseZaehler)++;
            if ((startphaseZaehler) > (spielerVw.getSpielerList().size())) {
                Phase = local.domain.Kriegsverwaltung.phasen.ANGRIFF;
            }
            spielerVw.naechsterSpieler();
            break;
        case VERSCHIEBEN :
            Phase = local.domain.Kriegsverwaltung.phasen.VERTEILEN;
            spielerVw.naechsterSpieler();
            break;
        case ANGRIFF :
            Phase = local.domain.Kriegsverwaltung.phasen.VERSCHIEBEN;
            break;
        case VERTEILEN :
            Phase = local.domain.Kriegsverwaltung.phasen.ANGRIFF;
            break;
    }
}