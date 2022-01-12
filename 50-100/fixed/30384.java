@com.facebook.react.bridge.ReactMethod
public void getInitialNotification(com.facebook.react.bridge.Promise promise) {
    android.app.Activity activity = getCurrentActivity();
    if (activity == null) {
        promise.resolve(null);
        return ;
    }
    android.content.Intent intent = activity.getIntent();
    if (((intent.getAction()) != null) && (intent.getAction().equals("android.intent.action.MAIN"))) {
        promise.resolve(null);
        return ;
    }
    promise.resolve(parseIntent(intent));
}