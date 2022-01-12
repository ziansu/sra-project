public void unRegistHxListener() {
    com.lib.base.log.KLog.i("MainService--->unRegistHxListener()");
    if ((mHxConnectListener) != null)
        com.lwk.familycontact.im.helper.HxSdkHelper.getInstance().removeConnectListener(mHxConnectListener);
    
    if ((mHxContactListener) != null)
        com.lwk.familycontact.im.helper.HxSdkHelper.getInstance().removeContactListener(mHxContactListener);
    
    if ((mHxMessageListener) != null)
        com.lwk.familycontact.im.helper.HxChatHelper.getInstance().removeMessageListener(mHxMessageListener);
    
    if ((mCallReceiver) != null)
        com.lwk.familycontact.im.receiver.HxCallReceiver.unregist(this, mCallReceiver);
    
}