@org.junit.Test
public void shouldThrowExceptionWhenLocationTagsDoseNotExist() throws java.lang.Exception {
    org.openmrs.healthStandard.converter.fhir.fhirModels.FhirLocation fhirLocation = new org.openmrs.healthStandard.converter.fhir.fhirModels.FhirLocation();
    org.hl7.fhir.dstu3.model.StringType fhirLocationTag = new org.hl7.fhir.dstu3.model.StringType("someId");
    fhirLocation.addTag(fhirLocationTag);
    fhirLocation.setStatus(LocationStatus.ACTIVE);
    expectedEx.expect(org.openmrs.healthStandard.converter.exceptions.EntityNotFoundException.class);
    expectedEx.expectMessage("Location Tag with uuid=someId does not exist");
    org.hl7.fhir.dstu3.model.org.openmrs.Location omrsLocation = converter.convert(fhirLocation);
}