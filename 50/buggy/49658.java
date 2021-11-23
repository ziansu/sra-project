@com.facebook.react.bridge.ReactMethod
public void isWXAppSupportApi(com.facebook.react.bridge.Callback resolve) {
    if ((api) == null) {
        callback.invoke(com.theweflex.react.WeChatModule.NOT_REGISTERED);
        return ;
    }
    callback.invoke(null, api.isWXAppSupportAPI());
}