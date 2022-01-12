@java.lang.Override
public void readPortable(com.hazelcast.nio.serialization.PortableReader reader) throws java.io.IOException {
    java.util.List<java.lang.String> nullChecker = com.google.common.collect.Lists.newArrayList(reader.readUTFArray("nullChecker"));
    if (nullChecker.contains("topicFilter"))
        topicFilter = reader.readUTF("topicFilter");
    
    if (nullChecker.contains("clientId"))
        qos = io.netty.handler.codec.mqtt.MqttQoS.valueOf(reader.readInt("qos"));
    
}