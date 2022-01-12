@org.junit.Test
public void testGetProps() {
    org.talend.components.api.properties.ComponentProperties props = new org.talend.components.splunk.TSplunkEventCollectorDefinition().createProperties();
    org.talend.daikon.properties.presentation.Form f = props.getForm(Form.MAIN);
    org.talend.components.api.test.ComponentTestUtils.checkSerialize(props, errorCollector);
    org.talend.daikon.properties.presentation.Form advancedF = props.getForm(Form.ADVANCED);
    java.lang.System.out.println(f);
    java.lang.System.out.println(advancedF);
    java.lang.System.out.println(props);
    org.junit.Assert.assertEquals(Form.MAIN, f.getName());
    org.junit.Assert.assertEquals(Form.ADVANCED, advancedF.getName());
}