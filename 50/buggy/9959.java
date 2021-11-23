private void checkValidationResult(org.freeshr.validations.FhirValidationResult validationResult) {
    checkForConceptValidationError(validationResult);
    checkForConditionErrors(validationResult);
    checkForExtensionErrors(validationResult);
}