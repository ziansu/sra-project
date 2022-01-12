@org.testng.annotations.Test
public void testInitImagePathNull() throws java.lang.Exception {
    java.lang.String testCaseId = "xyz";
    when(testSuite.getTestCase(testCaseId)).thenReturn(new de.consol.sakuli.datamodel.TestCase("test", testCaseId));
    testling.init(testCaseId, new java.lang.String[]{  });
    verify(exceptionHandler, times(1)).handleException(org.mockito.Matchers.any(java.io.IOException.class));
}