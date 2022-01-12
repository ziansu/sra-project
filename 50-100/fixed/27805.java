public void addNewReceivedMessages(com.lwk.familycontact.utils.event.HxMessageEventBean eventBean) {
    java.util.List<com.hyphenate.chat.EMMessage> messageList = eventBean.getMsgList();
    java.lang.String conId = mViewImpl.getConversationId();
    for (com.hyphenate.chat.EMMessage message : messageList) {
        if (com.lib.base.utils.StringUtil.isEquals(message.getFrom(), conId))
            mViewImpl.addNewMessage(message, false);
        
    }
}