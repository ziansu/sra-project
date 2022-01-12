private java.lang.String getNewChequenumbers(final org.egov.model.instrument.InstrumentHeader instrumentHeader, final java.lang.Integer department) {
    if (org.egov.egf.web.actions.payment.ChequeAssignmentAction.LOGGER.isDebugEnabled())
        org.egov.egf.web.actions.payment.ChequeAssignmentAction.LOGGER.debug("Starting getNewChequenumbers...");
    
    return chequeService.nextChequeNumber(instrumentHeader.getBankAccountId().getId().toString(), 1, department);
}