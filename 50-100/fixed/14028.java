mKvitto() {
    kassa.Kvitto k = skapaTomtK();
    for (int i = 0; i < 5; i++) {
        k.l = ggTillVara(skapaTomV());
    }
    assertTrue((k.getTotalM = (ngdVaror()) == 5));
    k.t = m();
    assertTrue((k.getTotalM = (ngdVaror()) == 0));
}