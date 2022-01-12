public void sendVoiceMessage(com.hyphenate.chat.EMConversation.EMConversationType conType, java.lang.String conId, java.lang.String filePath, int seconds) {
    com.hyphenate.chat.EMMessage emMessage = com.lwk.familycontact.im.helper.HxChatHelper.getInstance().createVoiceMessage(getChatTypeFromConType(conType), conId, filePath, seconds);
    emMessage.setMessageStatusCallback(new com.lwk.familycontact.project.chat.presenter.HxChatPresenter.MessageStatusCallBack(emMessage));
    mViewImpl.addNewMessage(emMessage);
    com.lwk.familycontact.im.helper.HxChatHelper.getInstance().sendMessage(emMessage);
}