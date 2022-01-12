@java.lang.Override
public com.arangodb.entity.CollectionStatus read(com.google.gson.stream.JsonReader in) throws java.io.IOException {
    if ((in.peek()) == (com.google.gson.stream.JsonToken.NULL)) {
        in.nextNull();
        return null;
    }
    return com.arangodb.entity.CollectionStatus.valueOf(in.nextInt());
}