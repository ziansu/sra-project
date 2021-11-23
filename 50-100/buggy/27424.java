public static void main(java.lang.String[] args) throws java.io.IOException {
    Event event = new Event(Event.createUUID(), Event.createUUID(), "text/plain", "Ztreamy-test", "Test event");
    event.setBody("Test body.");
    Serializer serializer = new JSONSerializer();
    java.lang.System.out.write(serializer.serialize(event));
}