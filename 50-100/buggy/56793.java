@org.junit.Test
public void testInputProps() throws java.lang.Throwable {
    org.talend.components.salesforce.tsalesforceinput.TSalesforceInputProperties props = ((org.talend.components.salesforce.tsalesforceinput.TSalesforceInputProperties) (new org.talend.components.salesforce.tsalesforceinput.TSalesforceInputDefinition().createProperties()));
    assertEquals(2, props.queryMode.getPossibleValues().size());
    org.talend.daikon.properties.Property returns = ((org.talend.daikon.properties.Property) (props.getProperty(ComponentProperties.RETURNS)));
    assertEquals("NB_LINE", returns.getChildren().get(0).getName());
}