public synchronized void addSchemaObject(com.suning.snfddal.dbobject.schema.SchemaObject obj) {
    obj.getSchema().add(obj);
    trace.debug("addSchemaObject: {0}", obj.getCreateSQL());
}