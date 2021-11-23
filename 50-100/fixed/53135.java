public void logMessage(java.lang.Object message) throws java.lang.Exception {
    if (null != (fileName)) {
        org.apache.camel.CamelContext context = org.kuali.ole.OleCamelContext.getInstance().getContext();
        if (null == (sedaProducer)) {
            sedaProducer = context.createProducerTemplate();
        }
        sedaProducer.sendBody("seda:messages", message);
    }else {
        throw new java.lang.Exception("File Path and File Name required.");
    }
}