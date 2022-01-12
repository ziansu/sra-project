public void sendImageMessage(com.hyphenate.chat.EMConversation.EMConversationType conType, java.lang.String conId, java.lang.String filePath, boolean sendOriginFile) {
    com.hyphenate.chat.EMMessage emMessage = com.lwk.familycontact.im.helper.HxChatHelper.getInstance().createImageMessage(getChatTypeFromConType(conType), conId, filePath, sendOriginFile);
    emMessage.setMessageStatusCallback(new com.lwk.familycontact.project.chat.presenter.HxChatPresenter.MessageStatusCallBack(emMessage));
    mViewImpl.addNewMessage(emMessage);
    com.lwk.familycontact.im.helper.HxChatHelper.getInstance().sendMessage(emMessage);
}