@java.lang.Override
public org.joda.time.DateTime deserialize(com.fasterxml.jackson.core.JsonParser jsonparser, com.fasterxml.jackson.databind.DeserializationContext deserializationcontext) throws java.io.IOException {
    return org.joda.time.format.ISODateTimeFormat.dateTime().parseDateTime(jsonparser.getText());
}