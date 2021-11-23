public boolean spielerRaus(local.domain.Spieler spieler) {
    for (local.domain.Land l : weltVw.getLaenderListe()) {
        if (l.getBesitzer().equals(spieler)) {
            return false;
        }
    }
    java.lang.System.out.println("Hier bin ich");
    spielerVw.getSpielerList().remove(spieler);
    return true;
}