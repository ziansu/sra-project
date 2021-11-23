@java.lang.Override
public boolean onRequest(final android.content.Intent request, final android.content.Intent response) {
    mHostMediaPlayerManager.playMedia();
    setResult(response, DConnectMessage.RESULT_OK);
    return true;
}