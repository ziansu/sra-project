@org.springframework.web.bind.annotation.RequestMapping(value = "/chat/{chatId}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<sjchat.restapi.entities.Chat> getChat(@org.springframework.web.bind.annotation.PathVariable
java.lang.String chatId) {
    final sjchat.messages.MessageServiceGrpc.MessageServiceBlockingStub blockingStub = sjchat.messages.MessageServiceGrpc.newBlockingStub(messageServiceChannel);
    sjchat.messages.GetChatResponse response = blockingStub.getChat(sjchat.messages.GetChatRequest.newBuilder().setId(chatId).build());
    sjchat.restapi.entities.Chat responseChat = response.getChat();
    sjchat.restapi.entities.Chat chat = sjchat.restapi.controllers.ChatController.buildChatFromResponse(responseChat);
    return new org.springframework.http.ResponseEntity(chat, org.springframework.http.HttpStatus.OK);
}