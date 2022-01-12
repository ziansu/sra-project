@java.lang.Override
public com.mongodb.client.Name decode(final org.bson.BsonReader reader, final org.bson.codecs.DecoderContext decoderContext) {
    reader.readStartDocument();
    java.lang.String name = reader.readString("_id");
    int count = ((int) (reader.readDouble("value")));
    reader.readEndDocument();
    return new com.mongodb.client.Name(name, count);
}