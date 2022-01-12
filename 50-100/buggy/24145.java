private void sendMessageToChatBot(java.lang.String containerId, java.lang.String status) {
    fr.aumjaud.antoine.services.common.http.HttpResponse httpResponse = httpHelper.postData(properties.getProperty("api-synology-chatbot.url"), ((("Deploy " + status) + " of ") + containerId), properties.getProperty("api-synology-chatbot.secure-key"));
    if ((httpResponse == null) || ((httpResponse.getHttpCode()) != (fr.aumjaud.antoine.services.common.http.HttpCode.OK))) {
        fr.aumjaud.antoine.services.docker.service.DockerService.logger.warn("Can't get response form chat-bot API");
    }
}