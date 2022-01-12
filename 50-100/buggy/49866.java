@java.lang.Override
public final void invalidateCand(final de.metas.invoicecandidate.model.I_C_Invoice_Candidate ic) {
    final int invoiceCandidateId = ic.getC_Invoice_Candidate_ID();
    org.adempiere.util.Check.assume((invoiceCandidateId > 0), "ic has an ID>0; ic={}", ic);
    final java.lang.String trxName = org.adempiere.model.InterfaceWrapperHelper.getTrxName(ic);
    invalidateCands(java.util.Collections.singleton(ic), trxName);
}