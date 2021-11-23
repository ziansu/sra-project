public void destroy(java.lang.String correlationId) {
    if (correlationId == null) {
        throw new java.lang.IllegalArgumentException("correlationId value cannot be 'null'.");
    }
    Iothub_client_wrapperLibrary.INSTANCE.IoTHubMessage_Destroy(javaWrapper.Message.messageHandle);
}