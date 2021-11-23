private void transactionRollback(java.lang.String transactionId) throws com.evolveum.polygon.connector.sap.JCoException {
    com.evolveum.polygon.connector.sap.JCoFunction function = destination.getRepository().getFunction("BAPI_TRANSACTION_ROLLBACK");
    if (function == null)
        throw new java.lang.RuntimeException("BAPI_TRANSACTION_ROLLBACK not found in SAP.");
    
    executeFunction(function, transactionId);
}