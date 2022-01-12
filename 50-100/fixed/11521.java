private void OnChatSendTextMessageResult(int eGroupType, long nGroupID, long nFromUserID, long nToUserID, java.lang.String sSeqID, int nResult) {
    synchronized(callbacks) {
        if ((callbacks.size()) > 0) {
            for (java.lang.ref.WeakReference<com.V2.jni.callback.ChatRequestCallback> wf : callbacks) {
                if ((wf.get()) == null) {
                    continue;
                }
                wf.get().OnSendTextResultCallback(eGroupType, nGroupID, nFromUserID, nToUserID, sSeqID, nResult);
            }
        }
    }
}