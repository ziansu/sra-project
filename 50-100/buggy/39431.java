@java.lang.Override
public boolean hasDerivedTradingUnitAssignmentsOnLUTU(final java.util.Properties ctx, final java.lang.Object model, final de.metas.handlingunits.model.I_M_HU topLevelHU, final de.metas.handlingunits.model.I_M_HU luHU, final de.metas.handlingunits.model.I_M_HU tuHU, final java.lang.String trxName) {
    final org.compiere.model.PO po = org.adempiere.model.InterfaceWrapperHelper.getPO(model);
    final int tableId = po.get_Table_ID();
    return getDerivedTradingUnitAssignmentsQueryBuilder(ctx, tableId, topLevelHU, luHU, tuHU, trxName).create().match();
}