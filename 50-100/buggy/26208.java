void writeRow(final com.fasterxml.jackson.core.JsonGenerator jsonGenerator, final org.jooq.Record record) throws com.fasterxml.jackson.core.JsonGenerationException, java.io.IOException, java.sql.SQLException {
    jsonGenerator.writeStartObject();
    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : record.intoMap().entrySet()) {
        jsonGenerator.writeObjectField(entry.getKey(), entry.getValue());
    }
    jsonGenerator.writeEndObject();
}