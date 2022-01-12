public void registHxListener() {
    com.lib.base.log.KLog.i("MainService--->registHxListener()");
    mHxConnectListener = new com.lwk.familycontact.im.listener.HxConnectListener();
    com.lwk.familycontact.im.helper.HxSdkHelper.getInstance().addConnectListener(mHxConnectListener);
    mHxContactListener = new com.lwk.familycontact.im.listener.HxContactListener();
    com.lwk.familycontact.im.helper.HxSdkHelper.getInstance().addContactListener(mHxContactListener);
    mHxMessageListener = new com.lwk.familycontact.im.listener.HxMessageListener();
    com.lwk.familycontact.im.helper.HxChatHelper.getInstance().addMessageListener(mHxMessageListener);
    mCallReceiver = com.lwk.familycontact.im.receiver.HxCallReceiver.regist(this);
}