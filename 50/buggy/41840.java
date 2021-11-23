private synchronized void putPublishMessage(org.overskeid.mqtt.packets.MqttPublish message) throws java.lang.InterruptedException {
    while ((publishMessages.size()) >= (org.overskeid.mqtt.service.MqttCommonucationHandler.MAXQUEUE))
        wait();
    
    publishMessages.addElement(message);
    notify();
}