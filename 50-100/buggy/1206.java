@java.lang.Override
public void process(org.apache.camel.Exchange exchange) throws java.lang.Exception {
    com.telapp.auro.camel.MqttProcessor.log.info(((("Executing the method process : " + (exchange.getIn().getBody())) + " header :") + (exchange.getIn().getHeaders())));
    java.lang.String body = ((java.lang.String) (exchange.getIn().getBody()));
    com.telapp.auro.beans.MqttRequest mqTT = convertToMQTT(body);
    saveData(mqTT);
    com.telapp.auro.camel.MqttProcessor.log.info("Finished executing the method process");
}