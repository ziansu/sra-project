@java.lang.Override
public void prepareForSave() {
    super.prepareForSave();
    if ((!(org.apache.commons.lang.StringUtils.equalsIgnoreCase(getInvoiceGeneralDetail().getBillingFrequencyCode(), ArConstants.MILESTONE_BILLING_SCHEDULE_CODE))) && (!(org.apache.commons.lang.StringUtils.equalsIgnoreCase(getInvoiceGeneralDetail().getBillingFrequencyCode(), ArConstants.PREDETERMINED_BILLING_SCHEDULE_CODE)))) {
        org.kuali.kfs.module.ar.document.service.ContractsGrantsInvoiceDocumentService contractsGrantsInvoiceDocumentService = org.kuali.kfs.sys.context.SpringContext.getBean(org.kuali.kfs.module.ar.document.service.ContractsGrantsInvoiceDocumentService.class);
        contractsGrantsInvoiceDocumentService.recalculateTotalAmountBilledToDate(this);
    }
}