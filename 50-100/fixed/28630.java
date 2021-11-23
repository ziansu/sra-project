public boolean isNutzerAdmin() {
    de.sitescrawler.jpa.Mitarbeiter mitarbeiterProfilVonNutzer = null;
    for (de.sitescrawler.jpa.Mitarbeiter m : this.getAusgewaehlteFirma().getMitarbeiter()) {
        if (m.getNutzer().equals(this.dataBean.getNutzer())) {
            mitarbeiterProfilVonNutzer = m;
        }
    }
    java.lang.System.out.println(((("Ist Nutzer Admin: " + mitarbeiterProfilVonNutzer) != null) && (mitarbeiterProfilVonNutzer.isAdmin())));
    return (mitarbeiterProfilVonNutzer != null) && (mitarbeiterProfilVonNutzer.isAdmin());
}