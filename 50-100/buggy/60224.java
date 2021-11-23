@java.lang.Override
public void serialize(final com.fasterxml.jackson.core.JsonGenerator jgen, final com.fasterxml.jackson.databind.SerializerProvider provider) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    jgen.writeStartObject();
    jgen.writeStringField("op", op);
    jgen.writeStringField("path", path.toString());
    jgen.writeEndObject();
}