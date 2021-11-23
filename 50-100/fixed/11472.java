@java.lang.Override
public void writeEndArray() {
    try {
        elementStack.remove(((elementStack.size()) - 1));
        jsonGenerator.writeEndArray();
    } catch (java.io.IOException e) {
        try {
            jsonGenerator.writeEndObject();
            jsonGenerator.writeEndArray();
        } catch (java.io.IOException e1) {
            org.wso2.datamapper.engine.output.writers.JacksonJSONWriter.log.error(e.getMessage(), e);
        }
    }
}