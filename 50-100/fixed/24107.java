private void transactionCommit() throws com.evolveum.polygon.connector.sap.JCoException {
    com.evolveum.polygon.connector.sap.JCoFunction function = destination.getRepository().getFunction("BAPI_TRANSACTION_COMMIT");
    if (function == null)
        throw new java.lang.RuntimeException("BAPI_TRANSACTION_COMMIT not found in SAP.");
    
    function.getImportParameterList().setValue("WAIT", com.evolveum.polygon.connector.sap.SapConnector.SELECT);
    executeFunction(function);
}