public void deleteTeamRoom(java.lang.String room, java.lang.String user, java.lang.String dbName) {
    chatStorage.deleteTeamRoom(room, user, dbName);
    java.util.List<java.lang.String> usersToBeNotified = userService.getUsersFilterBy(user, room, ChatService.TYPE_ROOM_TEAM, dbName);
    org.exoplatform.chat.services.RealTimeMessageBean messageBean = new org.exoplatform.chat.services.RealTimeMessageBean(RealTimeMessageBean.EventType.ROOM_DELETED, room, user, new java.util.Date(), null);
    realTimeMessageService.sendMessage(messageBean, user);
    realTimeMessageService.sendMessage(messageBean, usersToBeNotified);
}