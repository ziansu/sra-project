@java.lang.Override
public void write(java.io.DataOutput out) throws java.io.IOException {
    org.apache.avro.io.DatumWriter<org.apache.avro.generic.GenericRecord> writer = new org.apache.avro.generic.GenericDatumWriter<org.apache.avro.generic.GenericRecord>(avroSchema);
    assert out instanceof java.io.DataOutputStream;
    org.apache.avro.io.BinaryEncoder encoder = org.apache.avro.io.EncoderFactory.get().directBinaryEncoder(((java.io.DataOutputStream) (out)), null);
    writer.write(data, encoder);
}