@org.springframework.web.bind.annotation.RequestMapping(value = "/ajaxSendChatMessage", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object ajaxSendChatMessage(@org.springframework.web.bind.annotation.RequestBody
com.leon.rfq.domains.ChatMessageImpl chatMessage) {
    return this.chatMediatorService.sendMessage(chatMessage);
}