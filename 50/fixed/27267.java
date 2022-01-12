@java.lang.Override
public void onAuthenticationFailed() {
    callback.onError("指纹校验失败！");
}