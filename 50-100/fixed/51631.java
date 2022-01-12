public java.util.ArrayList<mobpro.hslu.ch.teamsrmf.Benutzer> filterUserListName(java.lang.String name, java.util.ArrayList<mobpro.hslu.ch.teamsrmf.Benutzer> liste) {
    java.util.ArrayList<mobpro.hslu.ch.teamsrmf.Benutzer> resultat = new java.util.ArrayList<>();
    if (liste != null) {
        if (!(liste.isEmpty())) {
            for (mobpro.hslu.ch.teamsrmf.Benutzer benutzer : liste) {
                if (benutzer.getName().equals(name)) {
                    resultat.add(benutzer);
                    break;
                }
            }
        }
    }
    return resultat;
}