@org.junit.Ignore(value = "oauth need manual operation")
@org.junit.Test
public void testOAuthBulkLogin() throws java.lang.Throwable {
    org.talend.components.salesforce.SalesforceConnectionProperties props = setupOAuthProps(null);
    props.bulkConnection.setValue(true);
    org.talend.daikon.properties.presentation.Form f = props.getForm(Form.MAIN);
    props = ((org.talend.components.salesforce.SalesforceConnectionProperties) (org.talend.daikon.properties.test.PropertiesTestUtils.checkAndValidate(getComponentService(), f, "testConnection", props)));
    org.junit.Assert.assertEquals(ValidationResult.Result.OK, props.getValidationResult().getStatus());
    org.talend.components.salesforce.SalesforceComponentTestIT.LOGGER.debug(props.getValidationResult().toString());
}