public void sendMessage(com.google.gson.JsonObject request, com.devicehive.websockets.converters.WebSocketResponse response, org.springframework.web.socket.WebSocketSession session) {
    com.google.gson.JsonObject message = new com.devicehive.websockets.converters.JsonMessageBuilder().addAction(request.get(com.devicehive.websockets.converters.JsonMessageBuilder.ACTION)).addRequestId(request.get(com.devicehive.websockets.converters.JsonMessageBuilder.REQUEST_ID)).include(response.getResponseAsJson()).build();
    sendMessage(message, session);
}