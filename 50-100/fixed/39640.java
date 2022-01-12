public boolean spielerRaus(local.domain.Spieler spieler) {
    for (local.domain.Land l : weltVw.getLaenderListe()) {
        if (l.getBesitzer().equals(spieler)) {
            return false;
        }
    }
    spielerVw.getSpielerList().remove(spieler);
    return true;
}