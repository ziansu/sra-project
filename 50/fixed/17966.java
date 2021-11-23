private co.cask.cdap.api.data.schema.Schema readArray(com.google.gson.stream.JsonReader reader, java.util.Map<java.lang.String, co.cask.cdap.api.data.schema.Schema> knownRecords) throws java.io.IOException {
    return co.cask.cdap.api.data.schema.Schema.arrayOf(readInnerSchema(reader, "items", knownRecords));
}