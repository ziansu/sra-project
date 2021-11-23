@java.lang.Override
public void onResume(boolean multitasking) {
    super.onResume(multitasking);
    com.plugin.gcm.PushPlugin.gForeground = true;
    clearNotifs();
    com.plugin.gcm.PushPlugin.sendConversationPnHas(getApplicationContext());
}