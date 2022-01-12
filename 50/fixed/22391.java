@java.lang.Override
public void shutDown() {
    kafkaProducer.flush();
    kafkaProducer.close();
}