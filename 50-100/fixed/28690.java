private void writeByteArray(org.codehaus.jackson.JsonGenerator out, byte[] bytes) throws java.io.IOException {
    out.writeStartArray();
    try {
        for (byte b : bytes) {
            out.writeNumber(((int) (b)));
        }
    } finally {
        out.writeEndArray();
    }
}