public void generateAllSubscriptions(com.axelor.rpc.ActionRequest request, com.axelor.rpc.ActionResponse response) throws com.axelor.exception.AxelorException {
    com.axelor.apps.sale.db.SaleOrder saleOrder = request.getContext().asType(com.axelor.apps.sale.db.SaleOrder.class);
    saleOrder = com.axelor.inject.Beans.get(com.axelor.apps.sale.db.repo.SaleOrderRepository.class).find(saleOrder.getId());
    for (com.axelor.apps.sale.db.SaleOrderLine saleOrderLineIt : saleOrder.getSaleOrderLineList()) {
        if (saleOrderLineIt.getProduct().getProductTypeSelect().equals(ProductRepository.PRODUCT_TYPE_SUBSCRIPTABLE)) {
            subscriptionService.generateSubscriptions(saleOrderLineIt, saleOrder);
        }
    }
    response.setReload(true);
}