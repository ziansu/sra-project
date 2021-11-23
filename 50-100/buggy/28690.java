private void writeByteArray(org.codehaus.jackson.JsonGenerator out, byte[] bytes) throws java.io.IOException {
    out.writeStartArray();
    for (byte b : bytes) {
        out.writeNumber(((int) (b)));
    }
    out.writeEndArray();
}