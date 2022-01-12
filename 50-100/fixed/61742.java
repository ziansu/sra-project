@org.junit.Test
public void testGetProps() {
    org.talend.components.api.properties.ComponentProperties props = new org.talend.components.salesforce.tsalesforceconnection.TSalesforceConnectionDefinition().createProperties();
    org.talend.daikon.properties.presentation.Form f = props.getForm(Form.MAIN);
    org.talend.components.api.test.ComponentTestUtils.checkSerialize(props, errorCollector);
    org.talend.components.salesforce.SalesforceComponentTestIT.LOGGER.debug(f.toString());
    org.talend.components.salesforce.SalesforceComponentTestIT.LOGGER.debug(props.toString());
    assertEquals(Form.MAIN, f.getName());
}