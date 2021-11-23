@org.junit.Test
public void ds4pGeneralTestAndHasErrors() {
    java.util.List<org.sitenv.referenceccda.validators.RefCCDAValidationResult> mdhtErrors = RefCCDATest.getMDHTErrorsFromResults(RefCCDATest.runIgOrMu2OrDS4PAndNotSchemaTests(RefCCDATest.DS4P_FROM_MDHT, CCDATypes.NON_SPECIFIC_DS4P, true));
    org.junit.Assert.assertTrue("The DS4P file does not contain errors as it should", ((mdhtErrors.size()) > 0));
}