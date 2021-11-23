public void klumpeAktuelle() {
    int lastAktuell = -1;
    for (int i = (ausfuehrungen.size()) - 1; i >= 0; i--) {
        final muettinghoven.dienstplan.app.model.DienstAusfuehrung ausfuehrung = ausfuehrungen.get(i);
        if (ausfuehrung.isAktuell()) {
            if (lastAktuell < 0)
                lastAktuell = i;
            else {
                lastAktuell--;
                if (i < lastAktuell)
                    moveTo(i, lastAktuell);
                
            }
        }
    }
}