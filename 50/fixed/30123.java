@java.lang.Override
public org.joda.time.LocalTime deserialize(com.fasterxml.jackson.core.JsonParser jp, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws java.io.IOException {
    return new org.joda.time.LocalTime(jp.getText());
}