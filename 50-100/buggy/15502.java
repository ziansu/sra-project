protected void loadDefaultEventType(java.io.File eventTypeFile) {
    try {
        java.lang.String fileContent = new java.lang.String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(eventTypeFile.toURI())), java.nio.charset.StandardCharsets.UTF_8);
        com.google.gson.JsonObject jsonEventType = de.hpi.bpt.argos.eventHandling.EventPlatformRestEndpointImpl.jsonParser.parse(fileContent).getAsJsonObject();
        entityManager.createSimpleEventType(jsonEventType, true);
    } catch (java.lang.Exception e) {
        de.hpi.bpt.argos.eventHandling.EventPlatformRestEndpointImpl.logger.error((("cannot load default event type '" + (eventTypeFile.getName())) + "'."), e);
    }
}