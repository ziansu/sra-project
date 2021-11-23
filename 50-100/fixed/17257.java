@java.lang.Deprecated
@java.lang.Override
public <T> com.arangodb.CursorResultSet<T> executeQueryWithResultSet(java.lang.String database, java.lang.String query, java.util.Map<java.lang.String, java.lang.Object> bindVars, java.lang.Class<T> clazz, java.lang.Boolean calcCount, java.lang.Integer batchSize) throws com.arangodb.ArangoException {
    com.arangodb.entity.CursorEntity<T> entity = executeQuery(database, query, bindVars, clazz, calcCount, batchSize, false);
    return new com.arangodb.CursorResultSet<T>(database, this, entity, clazz);
}