@java.lang.Override
public java.time.Year deserialize(com.fasterxml.jackson.core.JsonParser jsonParser, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    java.lang.String text = jsonParser.readValueAs(java.lang.String.class);
    if (text.isEmpty()) {
        return null;
    }
    return java.time.Year.parse(text);
}