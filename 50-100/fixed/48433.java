@org.junit.Test
public void testaTaBortVara() {
    java.math.BigDecimal bd = new java.math.BigDecimal(30);
    pris.setBelopp(bd);
    kassa.Kvitto k = new kassa.Kvitto();
    kassa.Vara v = new kassa.Vara("", pris);
    l = ggTillVaror(k);
    assertTrue((k.getTotalM = (ngdVaror()) == 10));
    k.taBortAllaAvEnVara(v);
    assertTrue((k.getTotalM = (ngdVaror()) == 0));
}