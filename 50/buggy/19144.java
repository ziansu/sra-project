@java.lang.Override
public void write(K key, V value) {
    kafka.producer.KeyedMessage<java.lang.String, org.apache.avro.generic.GenericRecord> message = new kafka.producer.KeyedMessage<java.lang.String, org.apache.avro.generic.GenericRecord>(topic, value.datum());
    producer.send(message);
}