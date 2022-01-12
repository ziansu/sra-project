@java.lang.Override
public com.fasterxml.jackson.dataformat.xml.ser.TestSerializerCustom.Item deserialize(com.fasterxml.jackson.dataformat.xml.ser.JsonParser p, com.fasterxml.jackson.dataformat.xml.ser.DeserializationContext ctxt) throws java.io.IOException {
    com.fasterxml.jackson.dataformat.xml.ser.JsonNode json = ctxt.readTree(p);
    com.fasterxml.jackson.dataformat.xml.ser.JsonNode foo = json.get("obj");
    if (foo == null) {
        throw new java.lang.IllegalStateException("missing foo property");
    }
    return new com.fasterxml.jackson.dataformat.xml.ser.TestSerializerCustom.Item(json.path("name").asText(), ctxt.treeToValue(foo, com.fasterxml.jackson.dataformat.xml.ser.TestSerializerCustom.Foo.class));
}