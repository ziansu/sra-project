@java.lang.Override
public void process(org.apache.camel.Exchange exchange) throws java.lang.Exception {
    java.lang.String body = exchange.getIn().getBody().toString();
    com.telapp.auro.camel.MqttProcessor.log.info(((("Executing the method process : " + body) + " header :") + (exchange.getIn().getHeaders())));
    com.telapp.auro.beans.MqttRequest mqTT = convertToMQTT(body);
    saveData(mqTT);
    com.telapp.auro.camel.MqttProcessor.log.info("Finished executing the method process");
}