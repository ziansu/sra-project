@java.lang.Override
public org.opencb.commons.datastore.core.QueryResult<org.opencb.biodata.models.variant.Variant> get(org.opencb.commons.datastore.core.Query query, org.opencb.commons.datastore.core.QueryOptions options) {
    org.bson.conversions.Bson bson = parseQuery(query);
    options = addVariantPrivateExcludeOptions(options);
    logger.info("query: {}", bson.toBsonDocument(org.bson.Document.class, com.mongodb.MongoClient.getDefaultCodecRegistry()).toJson());
    return mongoDBCollection.find(bson, null, org.opencb.biodata.models.variant.Variant.class, options);
}