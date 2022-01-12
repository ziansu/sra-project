public com.gensoft.saasapi.websocket.CmdRouter groupChat(@com.gensoft.core.annotation.Login
com.gensoft.core.pojo.UserInfo userInfo, @com.gensoft.saasapi.controller.RequestBody
com.gensoft.saasapi.pojo.chat.ChatMessage chatMessage) {
    chatService.saveGroupChat(chatMessage, userInfo.getId());
    com.gensoft.core.web.ApiResult apiResult = com.gensoft.core.web.ApiResult.successInstance("groupChat", chatMessage);
    java.util.List<java.lang.Long> receivers = userGroupService.getGroupUsers(chatMessage.getReceiverId());
    com.gensoft.saasapi.websocket.CmdRouter cmdRouter = new com.gensoft.saasapi.websocket.CmdRouter(apiResult, receivers);
    return cmdRouter;
}