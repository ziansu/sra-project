public java.lang.Boolean updateBillingSystem(final java.lang.String serviceCode, final java.util.Set<org.egov.collection.integration.models.BillReceiptInfo> billReceipts) {
    final org.egov.collection.integration.services.BillingIntegrationService billingService = getBillingServiceBean(serviceCode);
    if (billingService == null)
        return false;
    else
        try {
            billingService.updateReceiptDetails(billReceipts);
            return true;
        } catch (final java.lang.Exception e) {
            final java.lang.String errMsg = ("Exception while updating billing system [" + serviceCode) + "] with receipt details!";
            org.egov.collection.service.ReceiptHeaderService.LOGGER.error(errMsg, e);
            throw new org.egov.infra.exception.ApplicationRuntimeException(errMsg, e);
        }
    
}