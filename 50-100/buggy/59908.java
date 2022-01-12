@java.lang.Override
public void read(java.io.DataInput in) throws java.io.IOException {
    org.apache.avro.io.DatumReader<org.apache.avro.generic.GenericRecord> reader = new org.apache.avro.generic.GenericDatumReader<org.apache.avro.generic.GenericRecord>(avroSchema);
    org.apache.avro.io.Decoder decoder = org.apache.avro.io.DecoderFactory.get().binaryDecoder(((java.io.InputStream) (in)), null);
    data = reader.read(null, decoder);
}