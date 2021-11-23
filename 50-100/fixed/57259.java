private void drop(final com.deusdatsolutions.migrantverde.jaxb.IndexOperationType migration, final com.arangodb.ArangoDriver driver) throws com.arangodb.ArangoException {
    final java.lang.String collName = migration.getName();
    final com.arangodb.entity.IndexesEntity indexes = driver.getIndexes(collName);
    for (final com.arangodb.entity.IndexEntity ie : indexes.getIndexes()) {
        final com.deusdatsolutions.migrantverde.handlers.IndexHandler.IndexEntityWrapper wrapper = new com.deusdatsolutions.migrantverde.handlers.IndexHandler.IndexEntityWrapper(ie);
        if (migration.equals(wrapper)) {
            driver.deleteIndex(ie.getId());
            break;
        }
    }
}