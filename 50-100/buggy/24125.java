ggTillVaraIMetod() {
    kassa.Kvitto k = skapaTomtK();
    kassa.Vara v = skapaTomV();
    k.l = ggTillVara(skapaTomV(), 1);
    assert k.varaFinns(v);
    for (int i = 0; i < 7; i++) {
        k.l = ggTillVara(skapaTomV());
    }
    assert k.getTotalM = (ngdVaror()) == 8;
}