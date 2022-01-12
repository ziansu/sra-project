@org.junit.Test
@org.openmrs.test.Verifies(value = "should fail validation if all fields are null", method = "validate(object,Errors)")
public void validate_shouldFailValidationIfAllFieldsNull() throws java.lang.Exception {
    org.openmrs.Form form = new org.openmrs.Form();
    org.springframework.validation.Errors errors = new org.springframework.validation.BindException(form, "form");
    new org.openmrs.validator.FormValidator().validate(form, errors);
    org.junit.Assert.assertTrue(errors.hasFieldErrors("name"));
    org.junit.Assert.assertTrue(errors.hasFieldErrors("version"));
}