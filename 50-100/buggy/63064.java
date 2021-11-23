ggasTill() {
    java.util.HashMap<java.lang.Integer, kassa.Pengar> h1 = new java.util.HashMap<java.lang.Integer, kassa.Pengar>();
    kassa.Pengar p4 = new kassa.Pengar(100);
    h1.put(3, p4);
    kassa.Rabatt.addRabatt(v1, h1);
    k1.l = ggTillVara(v1, 3);
    assert (k1.getPrisUtanRabatt()) == 300;
    assertEquals(kassa.Rabatt.getRabatter().get(v1).get(3), p4);
}