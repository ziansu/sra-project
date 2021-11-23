@java.lang.Override
public boolean hasDerivedTradingUnitAssignmentsOnLUTU(final java.util.Properties ctx, final java.lang.Object model, final de.metas.handlingunits.model.I_M_HU topLevelHU, final de.metas.handlingunits.model.I_M_HU luHU, final de.metas.handlingunits.model.I_M_HU tuHU, final java.lang.String trxName) {
    return getDerivedTradingUnitAssignmentsQueryBuilder(ctx, model, topLevelHU, luHU, tuHU, trxName).create().match();
}