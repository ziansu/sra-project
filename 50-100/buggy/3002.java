private co.cask.cdap.api.data.schema.Schema readUnion(com.google.gson.stream.JsonReader reader, java.util.Set<java.lang.String> knownRecords) throws java.io.IOException {
    java.util.List<co.cask.cdap.api.data.schema.Schema> unionSchemas = new java.util.ArrayList<>();
    reader.beginArray();
    while ((reader.peek()) != (com.google.gson.stream.JsonToken.END_ARRAY)) {
        unionSchemas.add(read(reader, knownRecords));
    } 
    reader.endArray();
    return co.cask.cdap.api.data.schema.Schema.unionOf(unionSchemas);
}