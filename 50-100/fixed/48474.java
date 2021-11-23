public void sendTextMessage(com.hyphenate.chat.EMConversation.EMConversationType conType, java.lang.String conId, java.lang.String message) {
    com.hyphenate.chat.EMMessage emMessage = com.lwk.familycontact.im.helper.HxChatHelper.getInstance().createTextMessage(getChatTypeFromConType(conType), conId, message);
    emMessage.setMessageStatusCallback(new com.lwk.familycontact.project.chat.presenter.HxChatPresenter.MessageStatusCallBack(emMessage));
    mViewImpl.addNewMessage(emMessage, true);
    com.lwk.familycontact.im.helper.HxChatHelper.getInstance().sendMessage(emMessage);
}