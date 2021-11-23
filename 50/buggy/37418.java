private co.cask.cdap.api.data.schema.Schema readMap(com.google.gson.stream.JsonReader reader, java.util.Set<java.lang.String> knownRecords) throws java.io.IOException {
    return co.cask.cdap.api.data.schema.Schema.mapOf(readInnerSchema(reader, "keys", knownRecords), readInnerSchema(reader, "values", knownRecords));
}