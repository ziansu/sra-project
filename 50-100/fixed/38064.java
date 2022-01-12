@java.lang.Override
public boolean hasDerivedTradingUnitAssignments(final java.util.Properties ctx, final java.lang.Object model, final de.metas.handlingunits.model.I_M_HU topLevelHU, final de.metas.handlingunits.model.I_M_HU luHU, final de.metas.handlingunits.model.I_M_HU tuHU, final java.lang.String trxName) {
    final int recordId = org.adempiere.model.InterfaceWrapperHelper.getId(model);
    return getDerivedTradingUnitAssignmentsQueryBuilder(ctx, model, topLevelHU, luHU, tuHU, trxName).addEqualsFilter(I_M_HU_Assignment.COLUMN_Record_ID, recordId).create().match();
}