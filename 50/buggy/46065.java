@org.junit.Test
public void qtdSaintsAdicionandoDois() throws java.lang.Exception {
    new BronzeSaint("Seiya", "Pegasos");
    new SilverSaint("Marin", "Aguia");
    assertEquals(2, Saint.getQtdSaints());
}