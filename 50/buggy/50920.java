@java.lang.Override
public void onError(final int code, final java.lang.String message) {
    java.lang.String errMsg = (("ライトの状態更新に失敗しました hue:code = " + code) + "  message = ") + message;
    org.deviceconnect.android.message.MessageUtils.setUnknownError(response, errMsg);
    mErrorFlag = true;
    countDownLatch.countDown();
}