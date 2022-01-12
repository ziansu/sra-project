@org.junit.Test
public void testTelemetryInitializedWhenContextAvailable() {
    com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.initializerUnderTest.initialize(com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.telemetry);
    java.util.Map<java.lang.String, java.lang.String> properties = com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.telemetry.getProperties();
    org.junit.Assert.assertEquals(com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.DEFAULT_HOST, com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.telemetry.getContext().getDevice().getId());
    org.junit.Assert.assertEquals(com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.DEFAULT_IMAGE, properties.get(Constants.DOCKER_IMAGE_PROPERTY_KEY));
    org.junit.Assert.assertEquals(com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.DEFAULT_CONTAINER_NAME, properties.get(Constants.DOCKER_CONTAINER_NAME_PROPERTY_KEY));
    org.junit.Assert.assertEquals(com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.DEFAULT_CONTAINER_ID, properties.get(Constants.DOCKER_CONTAINER_ID_PROPERTY_KEY));
}