@java.lang.Override
public <T> T queryForObject(java.lang.Class<T> type, java.lang.String cypher, java.util.Map<java.lang.String, ?> parameters) {
    java.lang.Iterable<T> results = query(type, cypher, parameters);
    int resultSize = org.neo4j.ogm.session.Utils.size(results);
    if (resultSize < 1) {
        return null;
    }
    if (resultSize < 1) {
        throw new java.lang.RuntimeException(("Result not of expected size. Expected 1 row but found " + resultSize));
    }
    return results.iterator().next();
}