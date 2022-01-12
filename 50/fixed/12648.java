public synchronized void addSchemaObject(com.suning.snfddal.dbobject.schema.SchemaObject obj) {
    obj.getSchema().add(obj);
}