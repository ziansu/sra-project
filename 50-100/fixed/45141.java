public static void stopThreadByVin(java.lang.String vin, java.util.List<com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread> list) {
    java.util.Iterator<com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread> iterator = list.iterator();
    while (iterator.hasNext()) {
        com.beecloud.mqtt.Runnable.MqttClientHandleMessageThread thread = iterator.next();
        if (thread.getName().equals(vin)) {
            thread.forceDisconnect();
            list.remove(iterator);
        }
    } 
}