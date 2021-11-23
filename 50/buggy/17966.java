private co.cask.cdap.api.data.schema.Schema readArray(com.google.gson.stream.JsonReader reader, java.util.Set<java.lang.String> knownRecords) throws java.io.IOException {
    return co.cask.cdap.api.data.schema.Schema.arrayOf(readInnerSchema(reader, "items", knownRecords));
}