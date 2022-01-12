ggTillVarorIKonstruktor() {
    kassa.Vara v1 = skapaTomV();
    kassa.Vara v2 = skapaTomV();
    kassa.Kvitto k = new kassa.Kvitto(v1, v2);
    assertTrue(k.varaFinns(v1));
    assertTrue(k.varaFinns(v2));
    assertTrue((k.getTotalM = (ngdVaror()) == 2));
}