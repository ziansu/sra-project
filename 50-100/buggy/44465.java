@java.lang.Override
public com.fasterxml.jackson.dataformat.xml.ser.TestSerializerCustom.Item deserialize(com.fasterxml.jackson.dataformat.xml.ser.JsonParser jp, com.fasterxml.jackson.dataformat.xml.ser.DeserializationContext ctxt) throws java.io.IOException {
    com.fasterxml.jackson.dataformat.xml.ser.ObjectCodec oc = jp.getCodec();
    com.fasterxml.jackson.dataformat.xml.ser.JsonNode json = oc.readTree(jp);
    com.fasterxml.jackson.dataformat.xml.ser.JsonNode foo = json.get("obj");
    if (foo == null) {
        throw new java.lang.IllegalStateException("missing foo property");
    }
    return new com.fasterxml.jackson.dataformat.xml.ser.TestSerializerCustom.Item(json.path("name").asText(), oc.treeToValue(foo, com.fasterxml.jackson.dataformat.xml.ser.TestSerializerCustom.Foo.class));
}