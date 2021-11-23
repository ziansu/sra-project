@org.junit.Test
public void testFamily() {
    org.talend.components.api.component.ComponentDefinition cd = getComponentService().getComponentDefinition("tSalesforceConnection");
    org.junit.Assert.assertEquals(2, cd.getFamilies().length);
    org.junit.Assert.assertEquals("Business/Salesforce", cd.getFamilies()[0]);
    org.junit.Assert.assertEquals("Cloud/Salesforce", cd.getFamilies()[1]);
}