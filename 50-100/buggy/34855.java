public synchronized void addSchemaObject(org.h2.engine.Session session, org.h2.schema.SchemaObject obj) {
    int id = obj.getId();
    if ((id > 0) && (!(starting))) {
        checkWritingAllowed();
    }
    lockMeta(session);
    obj.getSchema().add(obj);
    addMeta(session, obj);
}