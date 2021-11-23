public void sendData(java.util.Map<java.lang.String, java.lang.String> data) {
    if ((topic) == null)
        topic = new org.fusesource.hawtbuf.UTF8Buffer(boxName);
    
    connection.publish(topic, new org.fusesource.hawtbuf.AsciiBuffer(ummisco.gama.network.common.SimpleMapSerializer.map2String(data)), QoS.AT_LEAST_ONCE, false);
}