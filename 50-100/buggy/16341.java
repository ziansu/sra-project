public byte[] encodeToJsonBytes(T record) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    jsonEncoder = org.apache.avro.io.EncoderFactory.get().jsonEncoder(this.schema, baos);
    avroWriter.write(record, jsonEncoder);
    jsonEncoder.flush();
    baos.flush();
    return baos.toByteArray();
}