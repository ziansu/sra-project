public void forceDisconnect() {
    try {
        client.disconnectForcibly();
        cache.clear();
        status = false;
    } catch (com.beecloud.mqtt.Runnable.MqttException e) {
        e.printStackTrace();
    }
}