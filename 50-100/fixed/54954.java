@org.testng.annotations.Test(dependsOnMethods = "placeOrder")
public void findOrder() throws javax.naming.NamingException, org.books.application.service.BookNotFoundException, org.books.application.service.CustomerNotFoundException, org.books.application.service.OrderNotFoundException, org.books.application.service.PaymentFailedException {
    logInfoClassAndMethodName(java.lang.Thread.currentThread().getStackTrace());
    org.books.application.dto.PurchaseOrder purchaseOrder = this.createPurchaseOrder();
    org.books.application.service.SalesOrder salesOrder = orderService.placeOrder(purchaseOrder);
    java.lang.Long salesOrderNumberToFind = salesOrder.getNumber();
    org.books.application.service.SalesOrder salesOrderFound = orderService.findOrder(salesOrderNumberToFind);
    org.testng.Assert.assertEquals(salesOrder.getId(), salesOrderFound.getId());
}