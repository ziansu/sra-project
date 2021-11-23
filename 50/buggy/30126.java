@org.junit.Before
public void init() {
    l = new business.Lieferant(1000, 3, 0.3, 5, 0);
    u = new business.Unternehmen("test");
    l.setVerbrauchteRessourcen(920);
}