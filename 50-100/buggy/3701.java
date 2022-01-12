private static void wrapProducerSend(java.lang.String previousChange, java.lang.String urlContent) {
    java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yy HH:mm:ss");
    java.util.Date dateobj = new java.util.Date();
    IngestKafka.producer.send(new org.apache.kafka.clients.producer.ProducerRecord<java.lang.String, java.lang.String>(IngestKafka.topic, ((df.format(dateobj)) + previousChange), "test string"));
}