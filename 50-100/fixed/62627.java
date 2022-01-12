public java.util.ArrayList<stamboom.domain.Persoon> getPersonenMetAchternaam(java.lang.String achternaam) {
    java.util.ArrayList<stamboom.domain.Persoon> persoonlijst = new java.util.ArrayList<>();
    for (int i = 0; i < (personen.size()); ++i) {
        stamboom.domain.Persoon p = personen.get(i);
        if (p.getAchternaam().toLowerCase().equals(achternaam.toLowerCase())) {
            persoonlijst.add(p);
        }
    }
    return persoonlijst;
}