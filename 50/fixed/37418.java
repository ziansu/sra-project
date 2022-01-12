private co.cask.cdap.api.data.schema.Schema readMap(com.google.gson.stream.JsonReader reader, java.util.Map<java.lang.String, co.cask.cdap.api.data.schema.Schema> knownRecords) throws java.io.IOException {
    return co.cask.cdap.api.data.schema.Schema.mapOf(readInnerSchema(reader, "keys", knownRecords), readInnerSchema(reader, "values", knownRecords));
}