public static java.util.List<com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread> stopThreadByVin(java.lang.String vin, java.util.List<com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread> list) {
    java.util.List<com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread> updateThreadList = new java.util.ArrayList<com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread>();
    java.util.Iterator<com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread> iterator = list.iterator();
    while (iterator.hasNext()) {
        com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread thread = iterator.next();
        if (thread.getName().equals(vin)) {
            thread.forceDisconnect();
        }else {
            updateThreadList.add(thread);
        }
    } 
    return updateThreadList;
}