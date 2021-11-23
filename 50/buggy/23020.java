protected java.lang.Object executeSQL() {
    com.orientechnologies.orient.core.db.document.ODatabaseDocument db = ODatabaseRecordThreadLocal.INSTANCE.getIfDefined();
    try {
        return executeSQLScript(db, parserText);
    } catch (java.io.IOException e) {
        throw new com.orientechnologies.orient.core.exception.OCommandExecutionException(("Error on executing command: " + (parserText)), e);
    }
}