nLista() {
    kassa.Kvitto k = skapaTomtK();
    java.util.ArrayList<kassa.Vara> varuSamling = new java.util.ArrayList<kassa.Vara>();
    for (int i = 0; i < 6; i++) {
        varuSamling.add(skapaTomV());
    }
    k.l(varuSamling);
    assertTrue((k.getTotalM = (ngdVaror()) == 6));
    java.util.Set<kassa.Vara> varuSet = new java.util.HashSet<kassa.Vara>(varuSamling);
    assertEquals(k.getVaruSet(), varuSet);
}