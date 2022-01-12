public boolean run(org.ensembl.healthcheck.DatabaseRegistryEntry dbre) {
    java.sql.Connection con = dbre.getConnection();
    if (tableHasRows(con, "sequence")) {
        org.ensembl.healthcheck.ReportManager.correct(this, con, "NO ENTRIES in sequence table, so nothing to test IGNORED");
        return true;
    }
    boolean result = true;
    result &= checkCountIsZero(con, "sequence", "sequence='' or sequence is NULL");
    result &= checkCountIsZero(con, "sequence", "length='' or length=0 or length is NULL");
    result &= checkCountIsZero(con, "sequence", "length!=length(sequence)");
    return result;
}