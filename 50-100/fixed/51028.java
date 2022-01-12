@java.lang.Override
public org.neo4j.driver.v1.StatementResult run(java.lang.String statementTemplate, java.util.Map<java.lang.String, java.lang.Object> statementParameters) {
    final org.neo4j.driver.v1.StatementResult result = session.run(statementTemplate, statementParameters);
    for (final java.util.Map.Entry<java.lang.String, neo4j.driver.reactive.interfaces.RecordChangeSetListener> entry : listeners.entrySet()) {
        final java.lang.String queryName = entry.getKey();
        final neo4j.driver.reactive.interfaces.RecordChangeSetListener listener = entry.getValue();
        final neo4j.driver.reactive.data.RecordChangeSet rcs = getDeltas(queryName);
        listener.notify(rcs);
    }
    return result;
}