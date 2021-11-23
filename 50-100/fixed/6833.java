public static java.lang.String createNewExecutionId() {
    java.lang.String executionId = null;
    org.safehaus.uuid.UUIDGenerator uuidGen = org.safehaus.uuid.UUIDGenerator.getInstance();
    org.safehaus.uuid.UUID uuidObj = uuidGen.generateTimeBasedUUID();
    executionId = uuidObj.toString();
    executionId = executionId.replaceAll("-", "");
    return executionId;
}