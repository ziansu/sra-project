private java.lang.String getRecordAsJson(java.lang.String recordId) {
    org.bson.conversions.Bson condition = com.mongodb.client.model.Filters.eq("about", recordId);
    org.bson.Document record = mongoDb.getCollection("record").find(condition).first();
    logger.info(("record: " + (record.toJson(codec))));
    transformer.transform(record);
    java.lang.String json = record.toJson(codec);
    return json;
}