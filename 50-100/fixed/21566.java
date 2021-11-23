@java.lang.Override
@java.lang.SuppressWarnings(value = "PMD.AvoidFinalLocalVariable")
public com.nervousfish.nervousfish.data_objects.IKey read(final com.google.gson.stream.JsonReader reader) throws java.io.IOException {
    reader.beginArray();
    final java.lang.String type = reader.nextString();
    reader.beginObject();
    final com.nervousfish.nervousfish.data_objects.IKey key;
    switch (type) {
        case com.nervousfish.nervousfish.ConstantKeywords.RSA_KEY :
            key = com.nervousfish.nervousfish.data_objects.RSAKey.fromJSON(reader);
            break;
        case "simple" :
            key = com.nervousfish.nervousfish.data_objects.SimpleKey.fromJSON(reader);
            break;
        default :
            throw new java.io.IOException("Could not read key");
    }
    reader.endObject();
    reader.endArray();
    return key;
}