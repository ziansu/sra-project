public int setCorrelationId(java.lang.String correlationId) {
    if (correlationId == null) {
        throw new java.lang.IllegalArgumentException("correlationId value cannot be 'null'.");
    }
    return Iothub_client_wrapperLibrary.INSTANCE.IoTHubMessage_SetCorrelationId(javaWrapper.Message.messageHandle, correlationId);
}