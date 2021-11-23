@org.junit.Test
public void testLoginFail() throws java.lang.Throwable {
    org.talend.components.salesforce.SalesforceConnectionProperties props = setupProps(null, (!(ADD_QUOTES)));
    props.userPassword.userId.setValue("blah");
    org.talend.daikon.properties.presentation.Form f = props.getForm(SalesforceConnectionProperties.FORM_WIZARD);
    props = ((org.talend.components.salesforce.SalesforceConnectionProperties) (org.talend.daikon.properties.test.PropertiesTestUtils.checkAndValidate(getComponentService(), f, "testConnection", props)));
    org.talend.components.salesforce.SalesforceComponentTestIT.LOGGER.debug(props.getValidationResult().toString());
    assertEquals(ValidationResult.Result.ERROR, props.getValidationResult().getStatus());
}