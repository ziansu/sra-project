@java.lang.Override
public neo4j.driver.reactive.interfaces.RecordChangeSetListener registerQuery(java.lang.String queryName, java.lang.String querySpecification) {
    if (querySpecifications.containsKey(queryName)) {
        throw new java.lang.IllegalStateException((("Query " + queryName) + " is already registered."));
    }
    querySpecifications.put(queryName, querySpecification);
    queryResults.put(queryName, com.google.common.collect.HashMultiset.create());
    final neo4j.driver.reactive.impl.Neo4jRecordChangeSetListener listener = new neo4j.driver.reactive.impl.Neo4jRecordChangeSetListener();
    listeners.put(queryName, listener);
    return listener;
}