@org.junit.Test
public void testSetPurchaseOrderStatus() {
    com.netbuilder.entities.PurchaseOrderTest.tester = new com.netbuilder.entities.PurchaseOrder(1, "Confirmed");
    com.netbuilder.entities.PurchaseOrderTest.tester.setPurchaseOrderStatus("Unconfirmed");
    assertEquals("Unconfirmed", com.netbuilder.entities.PurchaseOrderTest.tester.getPurchaseOrderStatus());
}