@java.lang.Override
public javax.ws.rs.core.Response putFile(java.lang.String schemaName, java.lang.String path, java.io.InputStream inputStream, java.lang.Long lastModified, java.lang.Integer msTimeout, java.lang.Integer target) {
    try {
        com.qwazr.store.schema.StoreSchemaDefinition schemaDef = StoreSchemaManager.INSTANCE.getSchema(schemaName);
        if (target == null)
            target = com.qwazr.utils.HashUtils.getMurmur3Mod(path, null, schemaDef.distribution_factor);
        
        return com.qwazr.store.data.StoreMasterDataService.getDataClient(schemaDef.nodes, msTimeout).putFile(schemaName, path, inputStream, lastModified, msTimeout, target);
    } catch (com.qwazr.utils.server.ServerException | java.net.URISyntaxException e) {
        throw com.qwazr.utils.server.ServerException.getJsonException(e);
    }
}