@java.lang.Override
public void run() {
    mViewImpl.closeHandlingDialog();
    com.hyphenate.chat.EMMessage emMessage = com.lwk.familycontact.im.helper.HxChatHelper.getInstance().createVideoMessage(getChatTypeFromConType(conType), conId, filePath, thumbPath, ((int) (duration / 1000)));
    emMessage.setMessageStatusCallback(new com.lwk.familycontact.project.chat.presenter.HxChatPresenter.MessageStatusCallBack(emMessage));
    mViewImpl.addNewMessage(emMessage, true);
    com.lwk.familycontact.im.helper.HxChatHelper.getInstance().sendMessage(emMessage);
}