@org.junit.Test
public void testIti8() throws java.lang.Exception {
    org.openehealth.ipf.gazelle.validation.core.stub.HL7V2XConformanceProfile runtimeProfile = unmarshalProfile(ItiPixPdqProfile.ITI_8_ADT_A40);
    org.openehealth.ipf.gazelle.validation.core.GazelleProfileRule profileRule = new org.openehealth.ipf.gazelle.validation.core.GazelleProfileRule(runtimeProfile);
    ca.uhn.hl7v2.validation.ValidationException[] exceptions = profileRule.apply(getParsedMessage("hl7/iti-8.hl7"));
    printOutExceptions(exceptions);
    assertEquals(1, countExceptions(exceptions, Severity.ERROR));
    assertEquals(3, countExceptions(exceptions, Severity.WARNING));
    assertEquals(1, countExceptions(exceptions, Severity.INFO));
}