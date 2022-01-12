public void start() {
    final java.lang.String methodName = "start";
    java.lang.String clientid = comms.getClient().getClientId();
    org.eclipse.paho.client.mqttv3.TimerPingSender.log.fine(org.eclipse.paho.client.mqttv3.TimerPingSender.CLASS_NAME, methodName, "659", new java.lang.Object[]{ clientid });
    timer = new java.util.Timer(("MQTT Ping: " + clientid));
    timer.schedule(new org.eclipse.paho.client.mqttv3.TimerPingSender.PingTask(), comms.getKeepAlive());
}