@java.lang.Override
public ai.labs.persistence.mongo.IHistoryResource<T> readHistory(java.lang.String id, java.lang.Integer version) {
    org.bson.Document objectId = new org.bson.Document(ai.labs.persistence.mongo.MongoResourceStorage.ID_FIELD, new org.bson.types.ObjectId(id));
    objectId.put(ai.labs.persistence.mongo.MongoResourceStorage.VERSION_FIELD, version);
    org.bson.Document doc = historyCollection.find(com.mongodb.client.model.Filters.eq(ai.labs.persistence.mongo.MongoResourceStorage.ID_FIELD, objectId)).first();
    if (doc == null) {
        return null;
    }
    return new HistoryResource(doc);
}