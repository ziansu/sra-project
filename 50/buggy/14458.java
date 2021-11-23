@com.facebook.react.bridge.ReactMethod
public void openWXApp(com.facebook.react.bridge.Callback resolve) {
    if ((api) == null) {
        callback.invoke(com.theweflex.react.WeChatModule.NOT_REGISTERED);
        return ;
    }
    resolve.invoke((api.openWXApp() ? null : com.theweflex.react.WeChatModule.INVOKE_FAILED));
}