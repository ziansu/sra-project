@java.lang.Override
public void serialize(com.facebook.presto.spi.SerializableNativeValue value, com.fasterxml.jackson.core.JsonGenerator generator, com.fasterxml.jackson.databind.SerializerProvider provider) throws java.io.IOException {
    generator.writeStartObject();
    generator.writeStringField("type", value.getType().getCanonicalName());
    generator.writeFieldName("value");
    if ((value.getValue()) == null) {
        generator.writeNull();
    }else {
        com.facebook.presto.spi.SerializableNativeValue.Serializer.writeValue(value, generator);
    }
    generator.writeEndObject();
}