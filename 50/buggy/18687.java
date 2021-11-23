@java.lang.Override
public void connect() throws java.lang.Exception {
    consumer.subscribe(topics);
    java.lang.System.out.println("kafka connected!");
}