public void forceDisconnect() {
    try {
        client.disconnectForcibly();
        cache.clear();
        this.destroy();
    } catch (com.beecloud.mqtt.Runnable.MqttException e) {
        e.printStackTrace();
    }
}