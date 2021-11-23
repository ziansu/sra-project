@java.lang.Override
public boolean generateIntegrityResults(final java.lang.String endpointId) throws java.lang.Exception {
    try {
        createContentletTemporaryTable(endpointId);
        processContentletIntegrityByStructureType(endpointId, Structure.STRUCTURE_TYPE_FILEASSET);
        com.dotmarketing.common.db.DotConnect dc = new com.dotmarketing.common.db.DotConnect();
        return ((java.lang.Long) (dc.getRecordCount(getIntegrityType().getResultsTableName()))) > 0;
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception("Error running the File Assets Integrity Check", e);
    }
}