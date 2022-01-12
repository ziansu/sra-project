@java.lang.Override
public void onSuccess(java.lang.String token) {
    try {
        getSpeechSendText().sendText(mContext, url, token, text, new com.willblaschko.android.alexa.AlexaManager.AsyncEventHandler(this, callback));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        if (callback != null) {
            callback.failure(e);
        }
    }
}