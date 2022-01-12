private void writePropertyContainer(org.codehaus.jackson.JsonGenerator out, org.neo4j.graphdb.PropertyContainer value) throws java.io.IOException {
    out.writeStartObject();
    for (java.lang.String key : value.getPropertyKeys()) {
        out.writeObjectField(key, value.getProperty(key));
    }
    out.writeEndObject();
}