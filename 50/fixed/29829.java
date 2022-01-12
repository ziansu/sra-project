@java.lang.Override
public gobblin.source.extractor.Extractor<org.apache.avro.Schema, org.apache.avro.generic.GenericRecord> getExtractor(gobblin.configuration.WorkUnitState state) throws java.io.IOException {
    return new gobblin.source.extractor.extract.kafka.KafkaAvroExtractor(state);
}