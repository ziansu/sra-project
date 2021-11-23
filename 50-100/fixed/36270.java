public void changeProductInventory(java.util.List<io.reactivesw.order.application.model.InventoryRequest> requestList) {
    io.reactivesw.order.application.service.OrderRestClient.LOG.debug("enter. requestList: {}.", requestList);
    try {
        java.lang.String url = inventoryUri;
        io.reactivesw.order.application.service.OrderRestClient.LOG.debug("InventoryUrl: {}.", url);
        restTemplate.put(url, requestList);
    } catch (org.springframework.web.client.HttpClientErrorException ex) {
        io.reactivesw.order.application.service.OrderRestClient.LOG.debug("change product inventory failed: {}", ex.getMessage());
        throw ex;
    }
    io.reactivesw.order.application.service.OrderRestClient.LOG.debug("exit.");
}