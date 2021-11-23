@java.lang.Override
public void createIndices(com.mongodb.DBCollection referenceCollection, com.mongodb.DBCollection cachedCollection) {
    super.createIndices(referenceCollection, cachedCollection);
    ensureIndex(referenceCollection, false, com.norconex.collector.http.data.store.impl.mongo.FIELD_CRAWL_STATE, com.norconex.collector.http.data.store.impl.mongo.MongoCrawlDataSerializer.FIELD_DEPTH);
}