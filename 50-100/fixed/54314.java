@org.junit.Test
public void testDefectNumber() {
    defect1.setNumber(3);
    assertTrue(((defect1.getNumber()) == 3));
    defect1.setNumber((-1));
    assertTrue(((defect1.getNumber()) == (-1)));
    defect1.setNumber(1952);
    assertTrue(((defect1.getNumber()) == 1952));
}