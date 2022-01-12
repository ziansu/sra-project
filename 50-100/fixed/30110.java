public void nextTurn() {
    switch (Phase) {
        case STARTPHASE :
            Phase = local.domain.Kriegsverwaltung.phasen.ANGRIFF;
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