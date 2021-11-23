public dk.meem.minappnr1.Feature readFeature(android.util.JsonReader reader) throws java.io.IOException {
    java.lang.String name;
    dk.meem.minappnr1.Feature feature = new dk.meem.minappnr1.Feature(null, null, null);
    reader.beginObject();
    while (reader.hasNext()) {
        name = reader.nextName();
        if (name.equals("properties")) {
            feature = readProperties(reader);
        }else {
            reader.skipValue();
        }
    } 
    reader.endObject();
    return feature;
}