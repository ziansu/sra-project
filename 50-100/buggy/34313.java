public void setOutputSelectors(java.util.List<org.apache.flink.streaming.api.collector.OutputSelector<?>> outputSelector) {
    try {
        if (outputSelector != null) {
            setDirectedEmit(true);
            config.setBytes(org.apache.flink.streaming.api.StreamConfig.OUTPUT_SELECTOR, org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable) (outputSelector))));
        }
    } catch (org.apache.commons.lang3.SerializationException e) {
        throw new java.lang.RuntimeException("Cannot serialize OutputSelector");
    }
}