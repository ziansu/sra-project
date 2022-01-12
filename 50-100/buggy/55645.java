public void clearUserData(java.lang.String event, java.lang.String openId) {
    java.lang.String userId = this.getUserIdByOpenId(event, openId);
    if (userId == null) {
        com.witvan.wechat.service.InteractionService.logger.info(("userId not found in getUserStatus by openId " + openId));
        userId = openId;
    }
    com.witvan.wechat.util.DataContainer.clearUser(event, userId);
    messageService.sendClear(event, openId);
}