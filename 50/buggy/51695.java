public void removeChatRequestCallback(com.V2.jni.callback.ChatRequestCallback callback) {
    synchronized(callbacks) {
        for (java.lang.ref.WeakReference<com.V2.jni.callback.ChatRequestCallback> wf : callbacks) {
            if ((wf.get()) == callback) {
                callbacks.remove(wf);
            }
        }
    }
}