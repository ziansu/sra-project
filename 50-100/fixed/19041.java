@java.lang.Override
public com.linkedin.pinot.core.data.GenericRow decode(byte[] payload, int offset, int length, com.linkedin.pinot.core.data.GenericRow destination) {
    try {
        org.apache.avro.generic.GenericData.Record avroRecord = _reader.read(null, _decoderFactory.binaryDecoder(payload, offset, length, null));
        return _rowGenerator.transform(avroRecord, destination);
    } catch (java.lang.Exception e) {
        com.linkedin.pinot.integration.tests.ClusterTest.AvroFileSchemaKafkaAvroMessageDecoder.LOGGER.error("Caught exception", e);
        throw new java.lang.RuntimeException(e);
    }
}