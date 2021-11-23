public static org.bson.conversions.Bson excludeId() {
    return new org.bson.BsonDocument("_id", new org.bson.BsonInt32(0));
}