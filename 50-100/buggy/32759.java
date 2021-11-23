private void OnChatMonitorRecvBinaryResult(int eGroupType, java.lang.String sSeqID, int nResult) {
    if ((callbacks.size()) > 0) {
        for (java.lang.ref.WeakReference<com.V2.jni.callback.ChatRequestCallback> wf : callbacks) {
            if ((wf.get()) == null) {
                continue;
            }
            wf.get().OnMonitorRecv(eGroupType, sSeqID, nResult);
        }
    }
}