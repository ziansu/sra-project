private void writeMap(org.codehaus.jackson.JsonGenerator out, java.util.Map value) throws java.io.IOException {
    out.writeStartObject();
    try {
        java.util.Set<java.util.Map.Entry> set = value.entrySet();
        for (java.util.Map.Entry e : set) {
            out.writeFieldName(e.getKey().toString());
            writeValue(out, e.getValue());
        }
    } finally {
        out.writeEndObject();
    }
}