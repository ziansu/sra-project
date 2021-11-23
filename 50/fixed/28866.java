public void destroy() {
    Iothub_client_wrapperLibrary.INSTANCE.IoTHubMessage_Destroy(javaWrapper.Message.messageHandle);
}