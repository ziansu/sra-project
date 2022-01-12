@java.lang.Override
public boolean generateIntegrityResults(final java.lang.String endpointId) throws java.lang.Exception {
    try {
        com.dotmarketing.common.db.DotConnect dc = new com.dotmarketing.common.db.DotConnect();
        createContentletTemporaryTable(endpointId);
        checkPages(endpointId, IntegrityType.HTMLPAGES);
        return ((java.lang.Long) (dc.getRecordCount(getIntegrityType().getResultsTableName(), (("where endpoint_id = '" + endpointId) + "'")))) > 0;
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception("Error running the HTML Pages Integrity Check", e);
    }
}