ggTillVaraIMetod() {
    kassa.Kvitto k = skapaTomtK();
    kassa.Vara v = skapaTomV();
    k.l = ggTillVara(skapaTomV(), 1);
    assertTrue(k.varaFinns(v));
    for (int i = 0; i < 7; i++) {
        k.l = ggTillVara(skapaTomV());
    }
    assertTrue((k.getTotalM = (ngdVaror()) == 8));
}