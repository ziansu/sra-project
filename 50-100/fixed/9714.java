static final int getPartitionForProcedure(org.voltdb.catalog.Procedure procedure, org.voltdb.StoredProcedureInvocation task) {
    final org.voltdb.CatalogContext.ProcedurePartitionInfo ppi = ((org.voltdb.CatalogContext.ProcedurePartitionInfo) (procedure.getAttachment()));
    if (procedure.getSinglepartition()) {
        return org.voltdb.InvocationDispatcher.getPartitionForProcedure(ppi.index, ppi.type, task);
    }else {
        return org.voltdb.iv2.MpInitiator.MP_INIT_PID;
    }
}