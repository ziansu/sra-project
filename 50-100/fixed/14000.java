public byte[] toBytes(ch.qos.logback.classic.spi.ILoggingEvent event) {
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    org.apache.avro.io.BinaryEncoder encoder = org.apache.avro.io.EncoderFactory.get().directBinaryEncoder(out, null);
    org.apache.avro.generic.GenericDatumWriter<org.apache.avro.generic.GenericRecord> writer = new org.apache.avro.generic.GenericDatumWriter(getAvroSchema());
    try {
        writer.write(toGenericRecord(event), encoder);
    } catch (java.io.IOException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
    return out.toByteArray();
}