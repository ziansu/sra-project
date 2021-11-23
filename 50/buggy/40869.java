@java.lang.Override
public com.emc.storageos.db.client.model.DataObject queryObject(java.net.URI id) {
    tracer.newTracer("read");
    java.lang.Class<? extends com.emc.storageos.db.client.model.DataObject> clazz = com.emc.storageos.db.client.URIUtil.getModelClass(id);
    return queryObject(clazz, id);
}