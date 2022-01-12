@org.junit.Test
public void getById_wrongId_errorMessage() {
    java.util.UUID randomId = java.util.UUID.randomUUID();
    java.lang.String expectedMessage = "Job not found.";
    boolean expectedError = true;
    net.hawkengine.model.ServiceResult actualResult = this.jobService.getById(randomId.toString());
    org.junit.Assert.assertNull(actualResult.getObject());
    org.junit.Assert.assertEquals(expectedError, actualResult.hasError());
    org.junit.Assert.assertEquals(expectedMessage, actualResult.getMessage());
}