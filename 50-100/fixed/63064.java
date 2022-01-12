ggasTill() {
    java.util.HashMap<java.lang.Integer, kassa.Pengar> h1 = new java.util.HashMap<java.lang.Integer, kassa.Pengar>();
    kassa.Pengar p4 = new kassa.Pengar(100);
    h1.put(3, p4);
    kassa.Rabatt.addRabatt(v1, h1);
    assertEquals(kassa.Rabatt.getRabatter(v1, 3), p4);
}