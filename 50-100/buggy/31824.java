@java.lang.Override
protected byte[] getData(org.openlca.cloud.model.data.Dataset dataset) throws java.io.IOException {
    org.openlca.core.model.RootEntity entity = org.openlca.core.database.Daos.createRootDao(db, dataset.type).getForRefId(dataset.refId);
    if (entity == null)
        return new byte[0];
    
    byte[] data = new byte[0];
    com.google.gson.JsonObject object = org.openlca.jsonld.output.JsonExport.toJson(entity);
    java.lang.String json = gson.toJson(object);
    data = json.getBytes(org.openlca.cloud.api.data.CHARSET);
    data = org.openlca.util.BinUtils.gzip(data);
    return data;
}