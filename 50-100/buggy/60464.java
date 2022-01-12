private static void sendRecord(java.lang.String topic, com.hurence.logisland.record.Record record) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    final com.hurence.logisland.serializer.KryoSerializer kryoSerializer = new com.hurence.logisland.serializer.KryoSerializer(true);
    kryoSerializer.serialize(baos, record);
    org.apache.kafka.clients.producer.ProducerRecord<java.lang.Integer, byte[]> data = new org.apache.kafka.clients.producer.ProducerRecord(com.hurence.logisland.engine.SparkRecordStreamProcessingTest.TOPIC, 0, baos.toByteArray());
    com.hurence.logisland.engine.SparkRecordStreamProcessingTest.producer.send(data);
    baos.close();
    com.hurence.logisland.engine.SparkRecordStreamProcessingTest.logger.info(((("sent record : " + record) + " to topic ") + topic));
}