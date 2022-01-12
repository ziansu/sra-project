@java.lang.Override
public void done(com.avos.avoscloud.im.v2.AVIMConversation avimConversation, com.avos.avoscloud.im.v2.AVIMException e) {
    if (filterException(e)) {
        com.avoscloud.leanchatlib.controller.ChatManager.getInstance().getRoomsTable().insertRoom(avimConversation.getConversationId());
        updateConversation(avimConversation);
    }
}