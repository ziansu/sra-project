private co.cask.cdap.api.data.schema.Schema readInnerSchema(com.google.gson.stream.JsonReader reader, java.lang.String key, java.util.Set<java.lang.String> knownRecords) throws java.io.IOException {
    if (!(key.equals(reader.nextName()))) {
        throw new java.io.IOException((("Property \"" + key) + "\" missing."));
    }
    return read(reader, knownRecords);
}