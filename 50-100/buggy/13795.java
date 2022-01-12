public com.axelor.apps.purchase.db.PurchaseOrderLine createPurchaseOrderLine(com.axelor.apps.purchase.db.PurchaseOrder purchaseOrder, com.axelor.apps.purchase.db.PurchaseOrderLine purchaseOrderLine) throws com.axelor.exception.AxelorException {
    com.axelor.apps.suppliermanagement.service.PurchaseOrderSupplierService.LOG.debug("Création d'une ligne de commande fournisseur pour le produit : {}", new java.lang.Object[]{ purchaseOrderLine.getProductName() });
    return purchaseOrderLineService.createPurchaseOrderLine(purchaseOrder, purchaseOrderLine.getProduct(), purchaseOrderLine.getDescription(), purchaseOrderLine.getQty(), purchaseOrderLine.getUnit());
}