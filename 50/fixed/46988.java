@java.lang.Override
public org.opencb.commons.datastore.core.QueryResult nativeGet(org.opencb.commons.datastore.core.Query query, org.opencb.commons.datastore.core.QueryOptions options) {
    org.bson.conversions.Bson bson = parseQuery(query);
    return mongoDBCollection.find(bson, options);
}