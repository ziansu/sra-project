gg() {
    java.util.Random slump = new java.util.Random();
    int min = 1;
    int randomInt = min + (slump.nextInt(999));
    for (int i = 0; i < randomInt; i++) {
        kassa.Vara v = new kassa.Vara(("" + randomInt), pris);
        k.l = ggTillVara(v);
        assert k.getTotalM = (ngdVaror()) == 1;
    }
    assert k.getTotalM = (ngdVaror()) == randomInt;
}