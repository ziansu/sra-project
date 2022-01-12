@org.junit.Test
public void testFamily() {
    org.talend.components.api.component.ComponentDefinition cd = getComponentService().getComponentDefinition("tSalesforceConnection");
    assertEquals(2, cd.getFamilies().length);
    assertEquals("Business/Salesforce", cd.getFamilies()[0]);
    assertEquals("Cloud/Salesforce", cd.getFamilies()[1]);
}