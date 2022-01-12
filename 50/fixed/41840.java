private void putPublishMessage(org.overskeid.mqtt.packets.MqttPublish message) throws java.lang.InterruptedException {
    synchronized(publishMessages) {
        while ((publishMessages.size()) >= (org.overskeid.mqtt.service.MqttCommonucationHandler.MAXQUEUE))
            publishMessages.wait();
        
        publishMessages.addElement(message);
        publishMessages.notify();
    }
}