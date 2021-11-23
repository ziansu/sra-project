@org.junit.Test
public void testFindingDouble() {
    double test = receiptScanner.getTotalCost(listOfDoubles);
    assertEquals("299.0", test);
}