@org.junit.Test
public void testSetPurchaseOrderID() {
    com.netbuilder.entities.PurchaseOrderTest.tester.setPurchaseOrderID(11);
    assertEquals(11, com.netbuilder.entities.PurchaseOrderTest.tester.getPurchaseOrderID());
}