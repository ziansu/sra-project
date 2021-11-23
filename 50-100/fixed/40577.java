public com.gensoft.saasapi.websocket.CmdRouter userChat(@com.gensoft.core.annotation.Login
com.gensoft.core.pojo.UserInfo userInfo, @com.gensoft.saasapi.controller.RequestBody
com.gensoft.saasapi.pojo.chat.ChatMessage chatMessage) {
    chatService.saveUserChat(chatMessage, userInfo.getId());
    com.gensoft.core.web.ApiResult apiResult = com.gensoft.core.web.ApiResult.successInstance("userChat", chatMessage);
    com.gensoft.saasapi.websocket.CmdRouter cmdRouter = new com.gensoft.saasapi.websocket.CmdRouter(apiResult, chatMessage.getReceiverId());
    return cmdRouter;
}