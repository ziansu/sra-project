@java.lang.Override
public void produce(java.lang.String jsonObject) {
    java.lang.System.out.print(".");
    producer.send(new org.apache.kafka.clients.producer.ProducerRecord("weatherData", jsonObject));
}