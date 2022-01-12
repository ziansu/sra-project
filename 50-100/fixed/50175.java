@com.google.inject.persist.Transactional
public void generateAllSubscriptions(com.axelor.rpc.ActionRequest request, com.axelor.rpc.ActionResponse response) throws com.axelor.exception.AxelorException {
    com.axelor.apps.sale.db.SaleOrder saleOrder = request.getContext().asType(com.axelor.apps.sale.db.SaleOrder.class);
    saleOrder = com.axelor.inject.Beans.get(com.axelor.apps.sale.db.repo.SaleOrderRepository.class).find(saleOrder.getId());
    subscriptionService.generateAllSubscriptions(saleOrder);
    response.setReload(true);
}