@java.lang.Override
public java.lang.Boolean call(org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.avro.generic.GenericRecord, org.apache.avro.generic.GenericRecord> record) throws java.lang.Exception {
    if ((record.value()) == null)
        return false;
    
    return true;
}