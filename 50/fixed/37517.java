@com.facebook.react.bridge.ReactMethod
public void verify(java.lang.String code, final com.facebook.react.bridge.Callback callback) {
    if ((mVerification) == null) {
        callback.invoke("Verification object not found. Did you call flashCall() or sms() first?", null);
        return ;
    }
    mCallback = callback;
    mVerification.verify(code);
}