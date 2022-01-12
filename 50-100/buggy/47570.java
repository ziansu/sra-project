public io.netty.handler.codec.mqtt.MqttPublishMessage pubRequestResponseRequest(jolie.net.CommMessage in) throws java.lang.Exception {
    java.lang.String a = in.operationName();
    if (hasOperationSpecificParameter(in.operationName(), jolie.net.MqttProtocol.Parameters.ALIAS)) {
        a = getOperationSpecificStringParameter(in.operationName(), jolie.net.MqttProtocol.Parameters.ALIAS);
    }
    addRespTopicToValue(in);
    return publishMsg(topic(in, a, true), valueToByteBuf(in), qos(in.operationName()));
}