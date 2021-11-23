mKvitto() {
    kassa.Kvitto k = skapaTomtK();
    for (int i = 0; i < 5; i++) {
        k.l = ggTillVara(skapaTomV());
    }
    assert k.getTotalM = (ngdVaror()) == 5;
    k.t = m();
    assert k.getTotalM = (ngdVaror()) == 0;
}