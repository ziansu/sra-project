@org.adempiere.ad.modelvalidator.annotations.ModelChange(timings = { org.compiere.model.ModelValidator.TYPE_BEFORE_NEW , org.compiere.model.ModelValidator.TYPE_BEFORE_CHANGE }, ifColumnsChanged = org.compiere.model.I_R_Request.COLUMNNAME_M_InOut_ID)
@org.adempiere.ad.callout.annotations.CalloutMethod(columnNames = { org.compiere.model.I_R_Request.COLUMNNAME_M_InOut_ID })
public void onMInOutSet(final org.compiere.model.de.metas.request.model.I_R_Request request) {
    final de.metas.inout.model.I_M_InOut inout = org.adempiere.model.InterfaceWrapperHelper.create(request.getM_InOut(), de.metas.inout.model.I_M_InOut.class);
    if (inout == null) {
        request.setDateDelivered(null);
    }
    request.setDateDelivered(inout.getMovementDate());
}