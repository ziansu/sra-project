public static org.doube.util.ResultInserter getInstance() {
    org.doube.util.ResultInserter.rt = ij.measure.ResultsTable.getResultsTable();
    final java.lang.String table = "Results";
    return org.doube.util.ResultInserter.INSTANCE;
}