public int setCorrelationId(java.lang.String correlationId) {
    return Iothub_client_wrapperLibrary.INSTANCE.IoTHubMessage_SetCorrelationId(javaWrapper.Message.messageHandle, correlationId);
}