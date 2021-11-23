@java.lang.Override
public void deleteResource(java.net.URI uri) throws java.io.IOException {
    org.mongojack.DBQuery.Query uriQ = cz.zcu.kiv.crce.metadata.dao.mongodb.internal.mapper.QueryBuilder.queryResourceByURI(uri.toString());
    cz.zcu.kiv.crce.metadata.dao.mongodb.internal.db.DbResource res = resources.findOne(uriQ);
    if (res != null) {
        org.mongojack.DBQuery.Query q = cz.zcu.kiv.crce.metadata.dao.mongodb.internal.mapper.QueryBuilder.queryByResourceId(res.getId());
        capabilities.remove(q);
        requirements.remove(q);
        properties.remove(q);
        resources.remove(uriQ);
    }
}