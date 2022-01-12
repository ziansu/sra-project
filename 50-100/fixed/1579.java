public int setCandidatesProcessed(@lombok.NonNull
final java.util.List<java.lang.Integer> huIds) {
    if (huIds.isEmpty()) {
        return 0;
    }
    final org.adempiere.ad.dao.IQueryBL queryBL = org.adempiere.util.Services.get(org.adempiere.ad.dao.IQueryBL.class);
    final org.adempiere.ad.dao.ICompositeQueryUpdater<de.metas.handlingunits.model.I_M_Picking_Candidate> updater = queryBL.createCompositeQueryUpdater(de.metas.handlingunits.model.I_M_Picking_Candidate.class).addSetColumnValue(I_M_Picking_Candidate.COLUMNNAME_Status, X_M_Picking_Candidate.STATUS_PR);
    return queryBL.createQueryBuilder(de.metas.handlingunits.model.I_M_Picking_Candidate.class).addOnlyActiveRecordsFilter().addEqualsFilter(I_M_Picking_Candidate.COLUMNNAME_Status, X_M_Picking_Candidate.STATUS_IP).addInArrayFilter(I_M_Picking_Candidate.COLUMNNAME_M_HU_ID, huIds).create().updateDirectly(updater);
}