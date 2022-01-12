@java.lang.Override
public final void invalidateCand(final de.metas.invoicecandidate.model.I_C_Invoice_Candidate ic) {
    if ((ic.getC_Invoice_Candidate_ID()) <= 0) {
        return ;
    }
    final java.lang.String trxName = org.adempiere.model.InterfaceWrapperHelper.getTrxName(ic);
    invalidateCands(java.util.Collections.singleton(ic), trxName);
}