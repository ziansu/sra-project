public void addKaeufer() {
    pos1_Projekt.Zufall zufall = new pos1_Projekt.Zufall();
    pos1_Projekt.Kaeufer k = new pos1_Projekt.Kaeufer();
    k.setName(zufall.getKaeuferBezeichnung());
    k.setUnternehmen(this);
    this.kaeuferliste.add(k);
}