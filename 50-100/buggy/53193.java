public java.lang.String content() throws java.io.IOException, org.hl7.fhir.dstu3.utils.EOperationOutcome, org.hl7.fhir.exceptions.FHIRException {
    org.hl7.fhir.dstu3.model.CodeSystem csc = cs.copy();
    csc.setId(cs.getId());
    new org.hl7.fhir.dstu3.utils.NarrativeGenerator(prefix, prefix, context).generate(csc);
    return new org.hl7.fhir.utilities.xhtml.XhtmlComposer().compose(csc.getText().getDiv());
}