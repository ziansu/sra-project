private static BatchManager.BatchModeType flushAndSetTxToNone(org.umlg.sqlg.structure.SqlgGraph sqlgGraph) {
    org.umlg.sqlg.structure.BatchManager.BatchModeType batchModeType = sqlgGraph.tx().getBatchModeType();
    if (sqlgGraph.tx().isInBatchMode()) {
        batchModeType = sqlgGraph.tx().getBatchModeType();
        sqlgGraph.tx().flush();
        sqlgGraph.tx().batchMode(BatchManager.BatchModeType.NONE);
    }
    return batchModeType;
}