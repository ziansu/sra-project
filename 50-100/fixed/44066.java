private us.kbase.common.schemamanager.SchemaManager getSchemaManager(final com.mongodb.DB db, final java.lang.String host) {
    if (db == null) {
        return null;
    }
    try {
        return new us.kbase.common.schemamanager.SchemaManager(db.getCollection(us.kbase.userandjobstate.UserAndJobStateServer.SCHEMA_VERS_COLLECTION));
    } catch (com.mongodb.MongoTimeoutException e) {
        fail(((("Couldn't connect to mongo host " + host) + ": ") + (e.getLocalizedMessage())));
    } catch (us.kbase.common.schemamanager.exceptions.InvalidSchemaRecordException e) {
        fail(("The schema version records are corrupt: " + (e.getLocalizedMessage())));
    }
    return null;
}