private void writePath(org.codehaus.jackson.JsonGenerator out, java.util.Iterator<org.neo4j.graphdb.PropertyContainer> value) throws java.io.IOException {
    out.writeStartArray();
    try {
        while (value.hasNext()) {
            writePropertyContainer(out, value.next());
        } 
    } finally {
        out.writeEndArray();
    }
}