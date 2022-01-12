@java.lang.Override
public java.util.List<com.axelor.apps.account.db.InvoiceLine> createInvoiceLines(com.axelor.apps.account.db.Invoice invoice, java.util.List<com.axelor.apps.purchase.db.PurchaseOrderLine> purchaseOrderLineList) throws com.axelor.exception.AxelorException {
    java.util.List<com.axelor.apps.account.db.InvoiceLine> invoiceLineList = new java.util.ArrayList<com.axelor.apps.account.db.InvoiceLine>();
    for (com.axelor.apps.purchase.db.PurchaseOrderLine purchaseOrderLine : purchaseOrderLineList) {
        if (!(ProductRepository.PRODUCT_TYPE_SUBSCRIPTABLE.equals(purchaseOrderLine.getProduct().getProductTypeSelect()))) {
            invoiceLineList.addAll(this.createInvoiceLine(invoice, purchaseOrderLine));
            purchaseOrderLine.setInvoiced(true);
        }
    }
    return invoiceLineList;
}