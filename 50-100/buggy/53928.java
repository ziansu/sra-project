private void unRegistHxListener() {
    com.lib.base.log.KLog.i("MainService--->unRegistHxListener()");
    com.lwk.familycontact.im.helper.HxSdkHelper.getInstance().removeConnectListener(mHxConnectListener);
    com.lwk.familycontact.im.helper.HxSdkHelper.getInstance().removeContactListener(mHxContactListener);
    com.lwk.familycontact.im.helper.HxChatHelper.getInstance().removeMessageListener(mHxMessageListener);
    com.lwk.familycontact.im.receiver.HxCallReceiver.unregist(this, mCallReceiver);
}