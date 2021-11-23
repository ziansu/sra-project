@java.lang.Override
public void actionPerformed(java.lang.String topicName, com.roboclub.robobuggy.ros.Message m) {
    com.roboclub.robobuggy.messages.GpsMeasurement gpsM = ((com.roboclub.robobuggy.messages.GpsMeasurement) (m));
    com.roboclub.robobuggy.nodes.sensors.GpsNodeTest.messageList.add(((com.roboclub.robobuggy.messages.GpsMeasurement) (m)));
}