@org.junit.Test
public void testUpdatePurchaseOrder() {
    com.netbuilder.entities.PurchaseOrderTest.tester.updatePurchaseOrder(5, "Unconfirmed");
    assertEquals("Unconfirmed", com.netbuilder.entities.PurchaseOrderTest.tester.getPurchaseOrderStatus());
    assertEquals(5, com.netbuilder.entities.PurchaseOrderTest.tester.getPurchaseOrderID());
}