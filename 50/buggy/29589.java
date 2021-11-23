private void updateEntity() throws com.arangodb.ArangoException {
    long cursorId = entity.getCursorId();
    this.entity = cursorDriver.continueQuery(database, cursorId, this.clazz);
    this.pos = 0;
}