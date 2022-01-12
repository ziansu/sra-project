@java.lang.Override
public void process(org.apache.camel.Exchange exchange) throws java.lang.Exception {
    java.lang.Integer batchSize = exchange.getProperty(Exchange.AGGREGATED_SIZE, java.lang.Integer.class);
    if (batchSize > 0) {
        me.tingenek.camel.component.marklogic.MLProducer.LOG.info(("Sending Batch of " + batchSize));
        batchProcess(exchange);
    }else
        if (batchSize == null) {
            singleProcess(exchange);
        }
    
}