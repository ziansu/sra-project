private co.cask.cdap.api.data.schema.Schema readInnerSchema(com.google.gson.stream.JsonReader reader, java.lang.String key, java.util.Map<java.lang.String, co.cask.cdap.api.data.schema.Schema> knownRecords) throws java.io.IOException {
    if (!(key.equals(reader.nextName()))) {
        throw new java.io.IOException((("Property \"" + key) + "\" missing."));
    }
    return read(reader, knownRecords);
}