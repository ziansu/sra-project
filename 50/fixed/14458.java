@com.facebook.react.bridge.ReactMethod
public void openWXApp(com.facebook.react.bridge.Callback callback) {
    if ((api) == null) {
        callback.invoke(com.theweflex.react.WeChatModule.NOT_REGISTERED);
        return ;
    }
    callback.invoke((api.openWXApp() ? null : com.theweflex.react.WeChatModule.INVOKE_FAILED));
}