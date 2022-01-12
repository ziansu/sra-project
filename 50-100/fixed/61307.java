public java.lang.String getGardenLocationsAsJson(java.lang.String uploadID) {
    umm3601.digitalDisplayGarden.AggregateIterable<org.bson.Document> documents = plantCollection.aggregate(java.util.Arrays.asList(com.mongodb.client.model.Aggregates.match(eq("uploadId", uploadID)), com.mongodb.client.model.Aggregates.group("$gardenLocation"), com.mongodb.client.model.Aggregates.sort(com.mongodb.client.model.Sorts.ascending("_id"))));
    return com.mongodb.util.JSON.serialize(documents);
}