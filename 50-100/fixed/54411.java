@java.lang.Override
public void removeOutputFromAllStreams(org.graylog2.plugin.streams.Output output) {
    org.bson.types.ObjectId outputId = new org.bson.types.ObjectId(output.getId());
    com.mongodb.DBObject match = new com.mongodb.BasicDBObject(StreamImpl.FIELD_OUTPUTS, outputId);
    com.mongodb.DBObject modify = new com.mongodb.BasicDBObject("$pull", new com.mongodb.BasicDBObject(StreamImpl.FIELD_OUTPUTS, outputId));
    collection(org.graylog2.streams.StreamImpl.class).update(match, modify, false, true);
}