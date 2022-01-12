@java.lang.Override
public E insertOrUpdate(E element) throws io.craigmiller160.orgbuilder.server.data.OrgApiDataException {
    java.lang.String insertOrUpdateQuery = queries.get(Query.INSERT_OR_UPDATE);
    io.craigmiller160.orgbuilder.server.logging.OrgApiLogger.getDataLogger().trace((((getElementName()) + " Insert or Update Query:\n") + insertOrUpdateQuery));
    try {
        return executeInsert(element, insertOrUpdateQuery);
    } catch (java.sql.SQLException ex) {
        throw new io.craigmiller160.orgbuilder.server.data.OrgApiDataException(((("Unable to insert or update " + (getElementName())) + ": ") + (element.toString())), ex);
    }
}