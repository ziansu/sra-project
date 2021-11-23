@java.lang.Override
public void runInternal() throws org.apache.hive.service.cli.HiveSQLException {
    setState(OperationState.RUNNING);
    try {
        if (isAuthV2Enabled()) {
            authorizeMetaGets(HiveOperationType.GET_CATALOGS, null);
        }
        setState(OperationState.FINISHED);
    } catch (org.apache.hive.service.cli.HiveSQLException e) {
        setState(OperationState.ERROR);
        throw e;
    }
}