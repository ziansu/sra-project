@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    com.urbanairship.push.PushMessage message = intent.getParcelableExtra(StringConstants.EXTRA_PUSH);
    android.os.Bundle pushExtras = message.getPushBundle();
    java.lang.String shouldStealFocusString = pushExtras.getString(StringConstants.STEAL_FOCUS_EXTRA);
    java.lang.Boolean shouldStealFocus = java.lang.Boolean.parseBoolean(shouldStealFocusString);
    if (shouldStealFocus) {
        if (isScreenLocked()) {
            unlockScreen();
        }
    }
}