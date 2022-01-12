@java.lang.Override
public long getEstimatedSizeBytes(org.apache.beam.sdk.options.PipelineOptions pipelineOptions) {
    com.mongodb.MongoClient mongoClient = new com.mongodb.MongoClient(new com.mongodb.MongoClientURI(spec.uri()));
    com.mongodb.client.MongoDatabase mongoDatabase = mongoClient.getDatabase(spec.database());
    com.mongodb.BasicDBObject stat = new com.mongodb.BasicDBObject();
    stat.append("collStats", spec.collection());
    org.bson.Document stats = mongoDatabase.runCommand(stat);
    return java.lang.Long.valueOf(stats.get("size").toString());
}