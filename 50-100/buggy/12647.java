@org.freeshr.application.fhir.Test
public void shouldValidateDiagnosisWithPreviousProcedureRequestExtension() throws java.lang.Exception {
    encounterBundle = org.freeshr.data.EncounterBundleData.encounter(EncounterBundleData.HEALTH_ID, org.freeshr.utils.FileUtil.asString("xmls/encounters/stu3/p98001046534_encounter_with_suspended_procedure_request.xml"));
    validationContext = new org.freeshr.validations.EncounterValidationContext(encounterBundle, new org.freeshr.utils.FhirFeedUtil());
    org.freeshr.application.fhir.EncounterValidationResponse response = validator.validate(validationContext);
    for (java.lang.Error error : response.getErrors()) {
        java.lang.System.out.println(error.getField());
        java.lang.System.out.println(error.getReason());
    }
    assertTrue(response.isSuccessful());
}