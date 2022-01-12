@java.lang.Override
public void activate(nu.nethome.home.system.HomeService server) {
    super.activate(server);
    try {
        client = new nu.nethome.home.items.net.MqttClient((((address) + ":") + (port)), "OpenNetHomeServer-Sub");
        client.setCallback(new nu.nethome.home.items.net.MqttClient.SubscribeCallback());
        client.connect();
        client.subscribe(baseTopic);
    } catch (java.lang.Exception e) {
        nu.nethome.home.items.net.MqttClient.logger.log(java.util.logging.Level.WARNING, "Failed to connect to MQTT Server", e);
    }
}