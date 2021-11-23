@com.facebook.react.bridge.ReactMethod
public void getApiVersion(com.facebook.react.bridge.Callback resolve) {
    if ((api) == null) {
        callback.invoke(com.theweflex.react.WeChatModule.NOT_REGISTERED);
        return ;
    }
    resolve.invoke(null, api.getWXAppSupportAPI());
}