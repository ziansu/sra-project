public io.reactivesw.product.application.model.ProductView getProductById(java.lang.String id) {
    io.reactivesw.product.application.service.ProductApplication.LOG.debug("enter getProductById, the id is : {}", id);
    io.reactivesw.product.application.model.ProductView result = productService.getProductById(id);
    java.util.List<io.reactivesw.product.application.model.InventoryEntryView> inventoryEntries = productRestClient.getInventoryEntry(result);
    if ((inventoryEntries != null) && (!(inventoryEntries.isEmpty()))) {
        result = io.reactivesw.product.infrastructure.util.ProductInventoryUtils.mergeInventoryEntryToProduct(inventoryEntries, result);
    }
    io.reactivesw.product.application.service.ProductApplication.LOG.debug("end getProductById, the product is : {}", result.toString());
    return result;
}