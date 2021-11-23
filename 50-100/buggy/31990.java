@org.junit.Test
public void getUserOperations_shouldReturnEmptyListWhenNoOperations() throws java.lang.Exception {
    org.openmrs.User user = org.openmrs.api.context.Context.getUserService().getUser(1);
    org.openmrs.module.openhmis.inventory.api.model.StockOperation operation = service.getById(2);
    operation.setStatus(StockOperationStatus.COMPLETED);
    service.save(operation);
    org.openmrs.api.context.Context.flushSession();
    java.util.List<org.openmrs.module.openhmis.inventory.api.model.StockOperation> results = service.getUserOperations(user, StockOperationStatus.REQUESTED, null, null, null);
    org.junit.Assert.assertNotNull(results);
    org.junit.Assert.assertEquals(0, results.size());
}