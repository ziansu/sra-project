@java.lang.Override
public org.apache.beam.sdk.io.kafka.KafkaRecord<K, V> decode(java.io.InputStream inStream, org.apache.beam.sdk.io.kafka.Context context) throws java.io.IOException, org.apache.beam.sdk.coders.CoderException {
    org.apache.beam.sdk.io.kafka.Context nested = context.nested();
    return new org.apache.beam.sdk.io.kafka.KafkaRecord<K, V>(org.apache.beam.sdk.io.kafka.KafkaRecordCoder.stringCoder.decode(inStream, nested), org.apache.beam.sdk.io.kafka.KafkaRecordCoder.intCoder.decode(inStream, nested), org.apache.beam.sdk.io.kafka.KafkaRecordCoder.longCoder.decode(inStream, nested), kvCoder.decode(inStream, context));
}