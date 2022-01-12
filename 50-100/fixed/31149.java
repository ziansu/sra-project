public org.openforis.collect.manager.validation.SurveyValidator.SurveyValidationResults validate(org.openforis.collect.model.CollectSurvey survey, org.openforis.collect.manager.validation.SurveyValidator.ValidationParameters validationParameters) {
    org.openforis.collect.manager.validation.SurveyValidator.SurveyValidationResults results = new org.openforis.collect.manager.validation.SurveyValidator.SurveyValidationResults();
    results.addResults(validateRootKeyAttributeSpecified(survey));
    results.addResults(validateShowCountInRecordListEntityCount(survey));
    results.addResults(validateSchemaNodes(survey));
    results.addResults(validateCodeLists(survey, validationParameters));
    results.addResults(validateSurveyFiles(survey, validationParameters));
    return results;
}