@java.lang.Override
public void init(org.wso2.carbon.event.input.adapter.core.InputEventAdapterListener eventAdapterListener) throws org.wso2.carbon.event.input.adapter.core.exception.InputEventAdapterException {
    this.eventAdapterListener = eventAdapterListener;
    try {
        mqttBrokerConnectionConfiguration = new org.wso2.carbon.device.mgt.input.adapter.mqtt.util.MQTTBrokerConnectionConfiguration(eventAdapterConfiguration, globalProperties);
        java.lang.String topic = eventAdapterConfiguration.getProperties().get(MQTTEventAdapterConstants.ADAPTER_MESSAGE_TOPIC);
        java.lang.String tenantDomain = topic.split("/")[0];
        mqttAdapterListener = new org.wso2.carbon.device.mgt.input.adapter.mqtt.util.MQTTAdapterListener(mqttBrokerConnectionConfiguration, topic, eventAdapterConfiguration, eventAdapterListener, tenantDomain);
    } catch (java.lang.Throwable t) {
        throw new org.wso2.carbon.event.input.adapter.core.exception.InputEventAdapterException(t.getMessage(), t);
    }
}