public void registerListenerAndReceivers(com.wwwsmschat.smschat.manager.SendSMSManager.OnSmsStatusListener listener) {
    this.mListener = listener;
    try {
        if (com.wwwsmschat.smschat.util.Validator.isObjectValid(listener)) {
            mActivity.registerReceiver(mDeliveredReceiver, new android.content.IntentFilter(com.wwwsmschat.smschat.manager.SendSMSManager.DELIVERED));
            mActivity.registerReceiver(mSentReceiver, new android.content.IntentFilter(com.wwwsmschat.smschat.manager.SendSMSManager.SENT));
        }else {
            mActivity.unregisterReceiver(mDeliveredReceiver);
            mActivity.unregisterReceiver(mSentReceiver);
        }
    } catch (java.lang.IllegalArgumentException e) {
        com.wwwsmschat.smschat.util.Logger.e(com.wwwsmschat.smschat.manager.SendSMSManager.TAG, e.toString());
    }
}