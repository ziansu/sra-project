@java.lang.Override
public void produce(java.lang.String jsonObject) {
    producer.send(new org.apache.kafka.clients.producer.ProducerRecord("weatherData", jsonObject));
}