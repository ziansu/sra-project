private float extractBatteryLevel(org.apache.kafka.clients.consumer.ConsumerRecord<?, org.apache.avro.generic.GenericRecord> record) {
    org.apache.avro.generic.GenericRecord value = record.value();
    org.apache.avro.Schema.Field batteryField = value.getSchema().getField("batteryLevel");
    if (batteryField == null) {
        throw new java.lang.IllegalArgumentException((("Failed to process record with value type " + (value.getSchema())) + " without batteryLevel field."));
    }
    java.lang.Number batteryLevel = ((java.lang.Number) (value.get(batteryField.pos())));
    return batteryLevel.floatValue();
}