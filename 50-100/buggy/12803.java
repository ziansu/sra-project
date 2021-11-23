@java.lang.Override
public void writePortable(com.hazelcast.nio.serialization.PortableWriter writer) throws java.io.IOException {
    java.util.List<java.lang.String> nullChecker = com.google.common.collect.Lists.newArrayList();
    if ((topicFilter) != null) {
        writer.writeUTF("topicFilter", topicFilter);
        nullChecker.add("topicName");
    }
    if ((qos) != null) {
        writer.writeInt("qos", qos.value());
        nullChecker.add("qos");
    }
    writer.writeUTFArray("nullChecker", nullChecker.toArray(new java.lang.String[0]));
}