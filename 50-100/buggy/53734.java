private static void sendPingReqToServer(common.instamsg.driver.InstaMsg c) {
    if ((c.socket.socketCorrupted) == true) {
        common.instamsg.driver.Log.errorLog("Socket not available at physical layer .. so server cannot be pinged for maintaining keep-alive.");
        return ;
    }
    common.instamsg.mqtt.org.eclipse.paho.client.mqttv3.internal.wire.MqttPingReq pingReqMsg = new common.instamsg.mqtt.org.eclipse.paho.client.mqttv3.internal.wire.MqttPingReq();
    byte[] packet = common.instamsg.driver.InstaMsg.getEncodedMqttMessageAsByteStream(pingReqMsg);
    if (packet != null) {
        common.instamsg.driver.InstaMsg.sendPacket(c, packet);
    }
}