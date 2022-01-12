@com.facebook.react.bridge.ReactMethod
public void getInitialNotification(com.facebook.react.bridge.Promise promise) {
    android.app.Activity activity = getCurrentActivity();
    android.content.Intent intent = activity.getIntent();
    if ((activity == null) || (((intent.getAction()) != null) && (intent.getAction().equals("android.intent.action.MAIN")))) {
        promise.resolve(null);
        return ;
    }
    promise.resolve(parseIntent(activity.getIntent()));
}