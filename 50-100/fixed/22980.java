@java.lang.Override
public void onAuthenticationHelp(final int helpMsgId, final java.lang.CharSequence helpString) {
    com.tencent.soter.core.model.SLogger.w(com.tencent.soter.wrapper.wrap_task.TaskAuthentication.TAG, "soter: on authentication help. you do not need to cancel the authentication: %d, %s", helpMsgId, helpString);
    com.tencent.soter.wrapper.wrap_task.SoterTaskThread.getInstance().postToMainThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((mFingerprintStateCallback) != null) {
                mFingerprintStateCallback.onAuthenticationHelp(helpMsgId, charSequenceToStringNullAsNil(helpString));
            }
        }
    });
}