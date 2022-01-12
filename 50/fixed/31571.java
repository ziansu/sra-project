@java.lang.Override
public kafka.javaapi.producer.Producer<byte[], byte[]> createConnection() throws java.lang.Exception {
    kafka.javaapi.producer.Producer<byte[], byte[]> producer = new kafka.javaapi.producer.Producer<byte[], byte[]>(config);
    return producer;
}