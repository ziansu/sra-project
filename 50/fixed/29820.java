public static org.bson.conversions.Bson exclude(final java.util.List<java.lang.String> fieldNames) {
    return com.mongodb.client.model.Projections.combine(fieldNames, new org.bson.BsonInt32(0));
}