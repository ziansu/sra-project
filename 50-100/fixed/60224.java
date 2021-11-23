@java.lang.Override
public void serialize(final com.fasterxml.jackson.core.JsonGenerator jgen, final com.fasterxml.jackson.databind.SerializerProvider provider) throws java.io.IOException {
    jgen.writeStartObject();
    jgen.writeStringField("op", this.op);
    jgen.writeStringField("path", this.path.toString());
    jgen.writeEndObject();
}