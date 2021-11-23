@org.junit.Test
public void testChangeExtendedOutput() {
    org.talend.components.splunk.TSplunkEventCollectorProperties props = ((org.talend.components.splunk.TSplunkEventCollectorProperties) (new org.talend.components.splunk.TSplunkEventCollectorDefinition().createProperties()));
    props.extendedOutput.setValue(true);
    props.eventsBatchSize.setValue(100);
    org.junit.Assert.assertEquals("Events batch size returned by the method should be 100", 100, props.getBatchSize());
    props.extendedOutput.setValue(false);
    org.junit.Assert.assertEquals("Events batch size returned by the method should be 1", 1, props.getBatchSize());
}