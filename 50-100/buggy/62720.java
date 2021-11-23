public void klumpeAktuelle() {
    int lastAktuell = -1;
    for (int i = (ausfuehrungen.size()) - 1; i >= 0; i--) {
        final muettinghoven.dienstplan.app.model.DienstAusfuehrung ausfuehrung = ausfuehrungen.get(i);
        if (ausfuehrung.isAktuell()) {
            if (i < (lastAktuell - 1))
                moveTo(i, (lastAktuell - 1));
            
            lastAktuell = i;
        }
    }
}