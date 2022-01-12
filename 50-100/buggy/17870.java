public void erstelleKaeufer(java.util.ArrayList<pos1_Projekt.Kaeufer> kaeuferliste, pos1_Projekt.Unternehmen unternehmen) {
    pos1_Projekt.Zufall zufall = new pos1_Projekt.Zufall();
    for (int i = 0; i < 2; ++i) {
        pos1_Projekt.Kaeufer k = new pos1_Projekt.Kaeufer();
        k.setName(zufall.getKaeuferBezeichnung(i));
        k.setUnternehmen(unternehmen);
        kaeuferliste.add(k);
    }
    zufall = null;
}